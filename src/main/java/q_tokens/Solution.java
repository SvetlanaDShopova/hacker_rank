package q_tokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s  = scanner.nextLine();

        tokenizeString(s);

        scanner.close();
    }

    private static void tokenizeString(String s) {
        if(isValidString(s)){
            s = s.replaceAll("[ !,?._'@]", " ");
            if(!s.isBlank()){
                String[] tokens = s.trim().split("\\p{Zs}+");
                System.out.println(tokens.length);
                for(String token: tokens){
                    if(!token.trim().isEmpty() && token.matches("^[a-zA-Z]*$")){
                        System.out.println(token);
                    }
                }
            } else {
                System.out.println(0);
            }
        } else {
            throw new IllegalArgumentException("Invalid string");
        }

    }

    private static boolean isValidString(String s) {
        return s != null && s.length() > 1 && s.matches("^[A-Za-z !,?._'@]*$");
    }

}
