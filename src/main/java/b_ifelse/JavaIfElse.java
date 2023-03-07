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

    private static String  getMessage(int number) {
        String message = "";
        return message ;
    }
}
