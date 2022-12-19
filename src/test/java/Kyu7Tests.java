import org.junit.Test;

import java.util.Arrays;

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
    public void findeOdd() {
        assertEquals(10, Kyu6.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
//        assertEquals(5, Kyu6.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
//        assertEquals(-1, Kyu6.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
//        assertEquals(5, Kyu6.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//        assertEquals(10, Kyu6.findIt(new int[]{10}));
//        assertEquals(1, Kyu6.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }


}
