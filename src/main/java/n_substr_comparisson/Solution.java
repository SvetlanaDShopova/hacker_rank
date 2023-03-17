package n_substr_comparisson;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k  = scanner.nextInt();

        String result  = getSmallestAndLargest(s, k);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int border = s.length()-k + 1;

        for(int i = 0; i < border; i++) {
            String sub = "";
            for(int j = i; j < i + k; j++) {
                sub += s.charAt(j);
            }

            if(i> 0) {
                if (sub.compareTo(smallest) < 0){
                    smallest = sub;
                }
                if(sub.compareTo(largest) > 0){
                    largest=sub;
                }
            } else {
                smallest = sub;
                largest=sub;
            }


        }
        return smallest + "\n" + largest;
    }
}
