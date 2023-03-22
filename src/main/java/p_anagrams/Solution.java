package p_anagrams;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String a, String b) {
       boolean isAnagram = false;
       if(isValidInput(a) && isValidInput(b)){
           if(a.length() == b.length()){
               a = a.toLowerCase();
               b = b.toLowerCase();
               if(a.equals(b)){
                   isAnagram = true;
               } else {
                   List<Character> sortedA = sortString(a);
                   List<Character> sortedB = sortString(b);
                  if(sortedA.equals(sortedB)){
                      isAnagram = true;
                  }
               }
           }
       } else {
           throw new IllegalArgumentException("Input is not valid");
       }
       return isAnagram;
    }

    private static List<Character> sortString(String input){
        char[] chars = input.toCharArray();
        List<Character> listChars = new ArrayList<>();
        for(char c : chars){
            listChars.add(c);
        }

        listChars.sort((a,b) -> a.compareTo(b));
        return listChars;
    }

    private static boolean isValidInput(String input) {

        if(input != null
                && !input.trim().isEmpty()
                && input.length() >= 1
                && input.length() <= 50
                && input.matches("^[a-z A-Z]*$")){
            return true;
        }
        return false;
    }

}
