package t_regex_duplicate_words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void testWithTripleWords() {
        String testSentense = "Goodbye bye bye world world world";

        String result = Solution.removeDuplicates(testSentense);

        assertTrue(result.equalsIgnoreCase("Goodbye bye world"));
    }

    @Test
    public void testWithTripleWordsandDuplicates() {
        String testSentense = "Sam went went to to to his business";

        String result = Solution.removeDuplicates(testSentense);

        assertTrue(result.equalsIgnoreCase("Sam went to his business"));
    }

    @Test
    public void testWithThreeDuplicates() {
        String testSentense = "Reya is is the the best player in eye eye game";

        String result = Solution.removeDuplicates(testSentense);

        assertTrue(result.equalsIgnoreCase("Reya is the best player in eye game"));
    }

    @Test
    public void testWithSpace() {
        String testSentense = "in inthe";

        String result = Solution.removeDuplicates(testSentense);

        assertTrue(result.equalsIgnoreCase("in inthe"));
    }

    @Test
    public void testCaseSensitivity() {
        String testSentense = "Hello hello Ab aB";

        String result = Solution.removeDuplicates(testSentense);

        assertTrue(result.equalsIgnoreCase("Hello Ab"));
    }

}
