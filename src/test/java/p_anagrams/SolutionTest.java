package p_anagrams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {

    @Test
    public void testNullInput(){
        String a = null;
        String b = "madara";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.isAnagram(a,b);
        });
    }

    @Test
    public void testEmptyInput(){
        String a = "";
        String b = "madara";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.isAnagram(a,b);
        });
    }

    @Test
    public void testWhiteSpacesInput(){
        String a = "    ";
        String b = "madara";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.isAnagram(a,b);
        });
    }

    @Test
    public void testNumbersInput(){
        String a = "daram1";
        String b = "madara";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.isAnagram(a,b);
        });
    }

    @Test
    public void testInputLengthGreaterThanFifty(){
        String a = "fhtidksmchdirkaprjdksbvketjsmdcftyhnmjuikwerfgtdsghjfthhfgjhgdd";
        String b = "madara";

        assertThrows(IllegalArgumentException.class, () -> {
            Solution.isAnagram(a,b);
        });
    }

    @Test
    public void testValidInputAnagrams(){
        String a = "anagram";
        String b = "margana";

        assertTrue(Solution.isAnagram(a,b));
    }

    @Test
    public void testValidInputNotAnagrams(){
        String a = "anagramm";
        String b = "marganaa";

        assertFalse(Solution.isAnagram(a,b));
    }

}
