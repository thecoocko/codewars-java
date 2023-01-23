import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kyu8Tests {
    @Test
    public void basicTests() {
        assertEquals(0, Kyu8.goals(0, 0, 0));
        assertEquals(58, Kyu8.goals(43, 10, 5));
    }

    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", Kyu8.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", Kyu8.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

    @Test
    public void test1() {
        assertEquals("I love you", Kyu8.howMuchILoveYou(1));
        assertEquals("a little", Kyu8.howMuchILoveYou(2));
        assertEquals("not at all", Kyu8.howMuchILoveYou(6));
    }
}
