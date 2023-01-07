import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kyu4Tests {
    @Test
    public void fixedTests() {
        assertEquals(1 , Kyu4.parseInt("one"));
        assertEquals(20 , Kyu4.parseInt("twenty"));
        assertEquals(246 , Kyu4.parseInt("two hundred forty-six"));
    }
}
