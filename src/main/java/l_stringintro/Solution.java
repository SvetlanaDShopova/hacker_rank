package l_stringintro;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String firstWord=sc.next();
        String secondWord=sc.next();

        System.out.println(firstWord.length() + secondWord.length());
        if(firstWord.compareTo(secondWord) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        firstWord = firstWord.toUpperCase().substring(0,1) + firstWord.substring(1, firstWord.length());

        secondWord = secondWord.toUpperCase().substring(0,1) + secondWord.substring(1, secondWord.length());

        System.out.println(firstWord + " " + secondWord);

        sc.close();

    }
}
