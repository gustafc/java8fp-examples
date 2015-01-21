package java8fp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static java8fp.Comparisons.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CompareByDifferenceTest {

    @Parameters(name = "{0} cmp {2} == {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, EQUALS, 5},
                {4, EQUALS, 6},
                {6, LESS_THAN, 3},
                {4, GREATER_THAN, 5},

        });
    }

    private final int a, b;
    private final int expectedOutcome;

    public CompareByDifferenceTest(int a, int expectedOutcome, int b) {
        this.a = a;
        this.b = b;
        this.expectedOutcome = expectedOutcome;
    }

    @Test
    public void testLambdaBased() {
        assertEquals(expectedOutcome, compareByDifferenceTo(5).compare(a, b));
    }

    @Test
    public void testClassBased() {
        assertEquals(expectedOutcome, new DifferenceComparator(5).compare(a, b));
    }


}
