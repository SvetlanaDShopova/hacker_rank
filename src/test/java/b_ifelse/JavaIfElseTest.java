package b_ifelse;

import org.junit.jupiter.api.Test;

public class JavaIfElseTest {

    private final String WEIRD = "Weird";
    private final String NOT_WEIRD = "Not weird";

    @Test
    public void providedOddNumber(){
        int number = 1;
        String message = JavaIfElse.getMessage(number);
        assert(message.equalsIgnoreCase(WEIRD));
    }

    @Test
    public void providedZero(){
        int number = 0;
        String message = JavaIfElse.getMessage(number);
        assert(message.equalsIgnoreCase(WEIRD));
    }

    @Test
    public void providedNumberBetweenTwoAndFive(){
        int number = 4;
        String message = JavaIfElse.getMessage(number);
        assert(message.equalsIgnoreCase(NOT_WEIRD));
    }

    @Test
    public void providedNumberAboveTwenty(){
        int number = 26;
        String message = JavaIfElse.getMessage(number);
        assert(message.equalsIgnoreCase(NOT_WEIRD));
    }
}
