package v_tag_extractor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private final String NONE = "None";

    @Test
    public void testTagsWithDiferentCase(){
        String testTag = "<Amee>safat codes like a ninja</amee>";

        String extract  = Solution.getTagContent(testTag);

        assertTrue(extract.equalsIgnoreCase(NONE));
    }

    @Test
    public void testDifferentEnd(){
        String testTag = "<Amee>safat codes like a ninja</ame>";

        String extract  = Solution.getTagContent(testTag);

        assertTrue(extract.equalsIgnoreCase(NONE));
    }

    @Test
    public void testNestedTags(){
        String testTag = "<h1><h1>Sanjay has no watch</h1></h1>";

        String extract  = Solution.getTagContent(testTag);

        assertTrue(extract.equalsIgnoreCase("Sanjay has no watch"));
    }
    @Test
    public void testMultipleTags(){
        String testTag = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

        String extract  = Solution.getTagContent(testTag);

        assertTrue(extract.equalsIgnoreCase("Sanjay has no watch\nSo wait for a while" ));
    }

    @Test
    public void testValidTags(){
        String testTag = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

        String extract  = Solution.getTagContent(testTag);

        assertTrue(extract.equalsIgnoreCase("Sanjay has no watch\nSo wait for a while" ));
    }
}
