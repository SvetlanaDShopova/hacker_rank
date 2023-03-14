package j_javadateandtime;

import org.junit.jupiter.api.Test;
import j_javadateandtime.Solution;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    j_javadateandtime.Solution classUnderTest = new Solution();

    @Test
    public void testMonday(){
        int month = 8;
        int day = 14;
        int year = 2017;
        assertTrue(j_javadateandtime.Solution.findDay(month,day, year).equalsIgnoreCase("MONDAY"));
    }

    @Test
    public void testWednesday(){
        int month = 8;
        int day = 5;
        int year = 2015;
        assertTrue(j_javadateandtime.Solution.findDay(month,day, year).equalsIgnoreCase("WEDNESDAY"));
    }
}
