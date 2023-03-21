package o_stringreverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        System.out.println(getPalindrome(A));
    }

    public static String getPalindrome(String a) {
        String answer = "";
        if(a != null && !a.trim().isEmpty() && a.trim().length() <=50 && a.matches("^[a-z]*$")){
            String test = "";

            for(int i = a.length()-1; i >= 0; i-- ){
                test = test + a.charAt(i);
            }

            if(a.equalsIgnoreCase(test)){
                answer = "Yes";
            } else {
                answer = "No";
            }
        } else {
            throw new IllegalArgumentException("Value not allowed");
        }
        return answer;
    }
}
