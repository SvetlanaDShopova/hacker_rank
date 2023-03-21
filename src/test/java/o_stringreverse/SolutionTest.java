package o_stringreverse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void emptyString(){
        String test = " ";

        assertThrows(IllegalArgumentException.class, () -> {
           Solution.getPalindrome(test);
        });
    }

    @Test
    public void testUpperCase(){
        String test = "MADAM ";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.getPalindrome(test);
        });
    }

    @Test
    public void testNumericCharacters(){
        String test = "ma5am ";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.getPalindrome(test);
        });
    }

    @Test
    public void testValidPalindrome(){
        String test = "madam";
        assertTrue(Solution.getPalindrome(test).equalsIgnoreCase("Yes"))   ;
    }

    @Test
    public void testNotValidPalindrome(){
        String test = "caramel";
        assertTrue(Solution.getPalindrome(test).equalsIgnoreCase("No"))   ;
    }


}
