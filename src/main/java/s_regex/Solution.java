package s_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        while(scanner.hasNext()){
            String ipv4 = scanner.nextLine();
            if(MyRegex.isValid(ipv4)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}

class MyRegex {
    private static final String onePart
            = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
   private static final String pattern
            = onePart + "\\."  + onePart + "\\." + onePart + "\\." + onePart;

    private static final Pattern pat = Pattern.compile(pattern);

    public static  boolean isValid(String ipv4){
        Matcher matcher = pat.matcher(ipv4);
        return matcher.matches();
    }
}


