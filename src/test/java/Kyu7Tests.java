import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Kyu7Tests {
    @Test
    public void arithmeticTest() {
        assertEquals("'add' should return the two numbers added together!", 3, Kyu7.arithmetic(1, 2, "add"));
        assertEquals("'subtract' should return a minus b!", 6, Kyu7.arithmetic(8, 2, "subtract"));
        assertEquals("'multiply' should return a multiplied by b!", 10, Kyu7.arithmetic(5, 2, "multiply"));
        assertEquals("'divide' should return a divided by b!", 4, Kyu7.arithmetic(8, 2, "divide"));
    }
    @Test
    public void numberTest() {
        assertIterableEquals(Arrays.asList(), Kyu7.number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"),  Kyu7.number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "),  Kyu7.number(Arrays.asList("", "", "", "", "")));
    }
    @Test
    public void longestTest() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", Kyu7.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", Kyu7.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", Kyu7.longest("inmanylanguages", "theresapairoffunctions"));
    }
    @Test
    public void highAndLoweTest1() {
        assertEquals("42 -9", Kyu7.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void highAndLoweTest2() {
        assertEquals("3 1", Kyu7.highAndLow("1 2 3"));
    }
    private void test(String message, int expected, int actual) {
        assertEquals(message, expected, actual);
    }
    @Test
    public void fixedTests() {
        String message = "Positive numbers";
        test(message, 40,  Kyu7.adjacentElementsProduct(new int[] {5, 8}));
        test(message, 6, Kyu7.adjacentElementsProduct(new int[] {1, 2, 3}));
        test(message, 90, Kyu7.adjacentElementsProduct(new int[] {1, 5, 10, 9}));
        test(message, 48, Kyu7.adjacentElementsProduct(new int[] {4, 12, 3, 1, 5}));
        test(message, 6, Kyu7.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));

        message = "Both positive and negative values";
        test(message, 21, Kyu7.adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
        test(message, 50, Kyu7.adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}));
        test(message, 30, Kyu7.adjacentElementsProduct(new int[] {5, 6, -4, 2, 3, 2, -23}));
        test(message, -14, Kyu7.adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));
        test(message, 6, Kyu7.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));

        message = "Contains zeroes";
        test(message, 0, Kyu7.adjacentElementsProduct(new int[] {1, 0, 1, 0, 1000}));
        test(message, 6, Kyu7.adjacentElementsProduct(new int[] {1, 2, 3, 0}));
    }

    @Test
    public void desc() {
        assertEquals(0, Kyu7.sortDesc(0));
        assertEquals(51, Kyu7.sortDesc(15));
        assertEquals(987654321, Kyu7.sortDesc(123456789));
       //assertEquals(2110, Kyu7.sortDesc(0112));

    }

    @Test
    public void getSum()
    {
        assertEquals(-1, Kyu7.GetSum(0, -1));
        assertEquals(1, Kyu7.GetSum(0, 1));
    }

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void gpsSpeed() {
        System.out.println("Fixed Tests: gps");
        testing(Kyu7.gps(20, new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}), 41);
        testing(Kyu7.gps(12, new double[] {0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25}), 219);
        testing(Kyu7.gps(20, new double[] {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84}), 80);
    }

    @Test
    public void getXO() {
        assertEquals(true, Kyu7.getXO("xxxooo"));
        assertEquals(true, Kyu7.getXO("xxxXooOo"));
        assertEquals(false, Kyu7.getXO("xxx23424esdsfvxXXOOooo"));
        assertEquals(false, Kyu7.getXO("xXxxoewrcoOoo"));
        assertEquals(false, Kyu7.getXO("XxxxooO"));
        assertEquals(true, Kyu7.getXO("zssddd"));
        assertEquals(false, Kyu7.getXO("Xxxxertr34"));
    }


    @Test
    public void testGcd() {

        assertEquals(6, Kyu7.compute(30,12));
        assertEquals(1, Kyu7.compute(8,9));
        assertEquals(1, Kyu7.compute(1,1));
    }

    @Test
    public void filterList() {
        assertEquals(List.of(1, 2), Kyu7.filterList(List.of(1, 2, "a", "b")));
        assertEquals(List.of(1, 0, 15), Kyu7.filterList(List.of(1, "a", "b", 0, 15)));
        assertEquals(List.of(1, 2, 123), Kyu7.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }

    @Test
    public void isIsogram() {
        assertEquals(true, Kyu7.isIsogram("Dermatoglyphics"));
        assertEquals(true, Kyu7.isIsogram("isogram"));
        assertEquals(false, Kyu7.isIsogram("moose"));
        assertEquals(false, Kyu7.isIsogram("isIsogram"));
        assertEquals(false, Kyu7.isIsogram("aba"));
        assertEquals(false, Kyu7.isIsogram("moOse"));
        assertEquals(true, Kyu7.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Kyu7.isIsogram(""));
    }

    @Test
    public void factorial() {
        assertEquals(1L, Kyu7.factorial(0));
        assertEquals(1L, Kyu7.factorial(1));
        assertEquals(24L, Kyu7.factorial(4));
        assertEquals(5040L, Kyu7.factorial(7));
    }

    @Test
    public void cubeOdd() {
        assertEquals(0, Kyu7.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, Kyu7.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, Kyu7.cubeOdd(new int[] {-3, -2, 2, 3}));

    }
}
