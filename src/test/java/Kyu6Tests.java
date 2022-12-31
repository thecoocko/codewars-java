import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kyu6Tests {
    @Test
    public void findeOdd() {
        assertEquals(10, Kyu6.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(5, Kyu6.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, Kyu6.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, Kyu6.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, Kyu6.findIt(new int[]{10}));
        assertEquals(1, Kyu6.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

//    @Test
//    public void digPow() {
//        assertEquals(1, Kyu6.digPow(89, 1));
//        assertEquals(51, Kyu6.digPow(46288, 3));
//        assertEquals(-1, Kyu6.digPow(92, 1));
//    }
@Test
public void pangram1() {
    String pangram1 = "The quick brown fox jumps over the lazy dog.";
    Kyu6 pc = new Kyu6();
    assertEquals(true, pc.check(pangram1));
}
    @Test
    public void pangram2() {
        String pangram2 = "You shall not pass!";
        Kyu6 pc = new Kyu6();
        assertEquals(false, pc.check(pangram2));
    }
}
