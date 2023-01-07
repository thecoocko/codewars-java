import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Kyu5Tests {
    @Test
    @DisplayName("Valid input")
    public void aplhanumeric() {
        assertTrue(Kyu5.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        assertFalse(Kyu5.alphanumeric("\"with space\""));
        assertFalse(Kyu5.alphanumeric("\"with_underscore\""));
        assertFalse(Kyu5.alphanumeric("punctuation."));
        assertFalse(Kyu5.alphanumeric("naïve"));
        assertFalse(Kyu5.alphanumeric("１strangedigit"));
        assertFalse(Kyu5.alphanumeric("emoji\uD83D\uDE0A"));
    }
}


