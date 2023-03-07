package a_stdinstdout;

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        scanner.close();

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
    }
}
