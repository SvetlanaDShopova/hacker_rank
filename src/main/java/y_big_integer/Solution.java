package y_big_integer;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.Predicate;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstInt = scan.next();
        String secondInt = scan.next();


        if(isValid(firstInt) && isValid(secondInt) ){
            BigInteger firstNumber = new BigInteger(firstInt);
            BigInteger secondNumber = new BigInteger(secondInt);

            System.out.println(firstNumber.add(secondNumber));
            System.out.println(firstNumber.multiply(secondNumber));
        }
    }


    /**
     * A valid string should contain only numbers,
     * should be less than 200 characters
     * @param number
     * @return true if valid
     */
    private static boolean isValid(String number){
        Predicate<String> isDigits = s -> s.matches("[\\d]*");
        Predicate<String> isLong = s -> s.length() > 0 && s.length() < 200;
        return isDigits.and(isLong).test(number);
    }


}
