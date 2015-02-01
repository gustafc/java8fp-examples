package java8fp.diamond;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void testDiamonds(){
        assertEquals("CA", new CA().m());
        assertEquals("CA", new X().m());
        assertEquals("IA", new Y().m());
        assertEquals("IA", new Y2().m());
        assertEquals("IA", new Z2().m());
    }
}
