package r_pattern_checker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines  = scanner.nextInt();
        scanner.reset();
        scanner.nextLine();
        for(int i = 0; i < lines; i++){
            String currentPattern = scanner.nextLine().trim();

           if(isValidPattern(currentPattern)){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }

    public static boolean isValidPattern(String currentPattern){
        try {
            Pattern p = Pattern.compile(currentPattern);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
