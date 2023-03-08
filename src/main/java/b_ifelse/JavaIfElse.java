package b_ifelse;

import java.util.Scanner;

public class JavaIfElse {

    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not weird";

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(getMessage(number));
    }

    public static String  getMessage(int number) {
        String message = WEIRD;
        if(number % 2 != 0){
            message = WEIRD;
        } else {
            if( (number >=2 && number <= 5) || number > 20){
                message = NOT_WEIRD;
            } else {
                message = WEIRD;
            }
        }
        return message ;
    }
}
