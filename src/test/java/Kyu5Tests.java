import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Kyu5Tests {
    @Test
    public void aplhanumeric() {
        assertTrue(Kyu5.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        assertFalse(Kyu5.alphanumeric("\"with space\""));
        assertFalse(Kyu5.alphanumeric("\"with_underscore\""));
        assertFalse(Kyu5.alphanumeric("punctuation."));
        assertFalse(Kyu5.alphanumeric("naïve"));
        assertFalse(Kyu5.alphanumeric("１strangedigit"));
        assertFalse(Kyu5.alphanumeric("emoji\uD83D\uDE0A"));
    }

    @Test
    public void ipsBetween() {
        assertEquals( 50, Kyu5.ipsBetween( "10.0.0.0", "10.0.0.50" ) );
        assertEquals( 246, Kyu5.ipsBetween( "20.0.0.10", "20.0.1.0" ) );
        assertEquals( (1l << 32l) - 1l, Kyu5.ipsBetween( "0.0.0.0", "255.255.255.255" ) );
    }


}


