package r_pattern_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void testValidPattern(){
        String testPattern = "([a]+)(.+)";

        assertTrue(Solution.isValidPattern(testPattern));
    }

    @Test
    public void testInvalidPattern(){
        String testPattern = "[][]";

        assertFalse(Solution.isValidPattern(testPattern));
    }
}
