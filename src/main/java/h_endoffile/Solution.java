package h_endoffile;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = 0;
        while(scanner.hasNext()){
           lines++;
           System.out.println(lines + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
