package java8fp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static java8fp.Comparisons.compareAlphaNumeric;
import static java8fp.Comparisons.EQUALS;
import static java8fp.Comparisons.LESS_THAN;
import static java8fp.Comparisons.GREATER_THAN;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ComparisonsTest {

    @Parameters(name = "{0} cmp= {2} == {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Simple cases
                {"", EQUALS, ""},
                {"0", EQUALS, "0"},
                {"a", EQUALS, "a"},
                {"a", LESS_THAN, "b"},
                {"b", GREATER_THAN, "a"},
                // The harder stuff
                {"1", LESS_THAN, "a"},
                {"9", LESS_THAN, "20"},
                {"b", GREATER_THAN, "2"},

        });
    }

    private final String a, b;
    private final int expectedOutcome;

    public ComparisonsTest(String a, int expectedOutcome, String b) {
        this.a = a;
        this.b = b;
        this.expectedOutcome = expectedOutcome;
    }

    @Test
    public void testOutcome() {
        assertEquals(expectedOutcome, compareAlphaNumeric(a, b));
    }


}
