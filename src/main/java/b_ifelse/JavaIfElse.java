package b_ifelse;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(getMessage(number));
    }

    public static String  getMessage(int number) {
        String message = "";
        if(number % 2 != 0){
            message = "Weird";
        } else {
            if( (number >=2 && number <= 5) || number > 20){
                message = "Not Weird";
            } else {
                message = "Weird";
            }
        }
        return message ;
    }
}
