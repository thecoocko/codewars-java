import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void dashatizeBasic() {
        assertEquals("2-7-4", Kyu6.dashatize(274));
        assertEquals("5-3-1-1", Kyu6.dashatize(5311));
        assertEquals("86-3-20", Kyu6.dashatize(86320));
        assertEquals("9-7-4-3-02", Kyu6.dashatize(974302));
    }

    @Test
    public void dashatizeWeird() {
        assertEquals("0", Kyu6.dashatize(0));
        assertEquals("1", Kyu6.dashatize(-1));
        assertEquals("28-3-6-9", Kyu6.dashatize(-28369));
    }

    @Test
    public void dashatizeEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", Kyu6.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", Kyu6.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", Kyu6.dashatize(-1111111111));
    }
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
//    @Test
//    public void test() {
//        System.out.println("longestConsec Fixed Tests");
//        testing(Kyu6.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
//        testing(Kyu6.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
//        testing(Kyu6.longestConsec(new String[] {}, 3), "");
//        testing(Kyu6.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
//        testing(Kyu6.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
//        testing(Kyu6.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
//        testing(Kyu6.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
//        testing(Kyu6.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
//        testing(Kyu6.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
//    }
@Test
public void countSmileys1() {
    List<String> a = new ArrayList<String>();
    a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
    assertEquals(2, Kyu6.countSmileys(a));
}

    @Test
    public void countSmileys2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, Kyu6.countSmileys(a));
    }

    @Test
    public void countSmileys3() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, Kyu6.countSmileys(a));
    }

    @Test
    public void countSmileys4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(";)D"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(3, Kyu6.countSmileys(a));
    }
    @Test
    public void findNb1() {
        assertEquals(2022, Kyu6.findNb(4183059834009L));
    }
    @Test
    public void findNb2() {
        assertEquals(-1, Kyu6.findNb(24723578342962L));
    }
    @Test
    public void findNb3() {
        assertEquals(4824, Kyu6.findNb(135440716410000L));
    }
    @Test
    public void findNb4() {
        assertEquals(3568, Kyu6.findNb(40539911473216L));
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", Kyu6.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kyu6.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kyu6.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", Kyu6.high("aa b"));
        assertEquals("b", Kyu6.high("b aa"));
        assertEquals("bb", Kyu6.high("bb d"));
        assertEquals("d", Kyu6.high("d bb"));
        assertEquals("aaa", Kyu6.high("aaa b"));
    }

    @Test
    public void camelCase() {
        assertEquals( "Incorrect", "camel Casing", Kyu6.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", Kyu6.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", Kyu6.camelCase("camelcasingtest"));
    }

    private double precision = 0.0000000000001;

    @Test
    public void findUniq() {
        assertEquals(1.0, Kyu6.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, Kyu6.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(4.0, Kyu6.findUniq(new double[]{1, 1, 4, 1,3, 1,3, 1}), precision);
    }

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kyu6.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Kyu6.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Kyu6.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", Kyu6.encrypt("This is a test!", 3));
        assertEquals("This is a test!", Kyu6.encrypt("This is a test!", 4));
        assertEquals("This is a test!", Kyu6.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", Kyu6.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kyu6.decrypt("This is a test!", 0));
        assertEquals("This is a test!", Kyu6.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", Kyu6.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", Kyu6.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", Kyu6.decrypt("This is a test!", 4));
        assertEquals("This is a test!", Kyu6.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", Kyu6.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", Kyu6.encrypt("", 0));
        assertEquals("", Kyu6.decrypt("", 0));
        assertEquals(null, Kyu6.encrypt(null, 0));
        assertEquals(null, Kyu6.decrypt(null, 0));
    }

}
