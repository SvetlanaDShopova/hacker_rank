package t_regex_duplicate_words;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
    private static final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
   

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numSentences = Integer.parseInt(scanner.nextLine());

        while (numSentences-- > 0) {
            String sentence = scanner.nextLine();

            System.out.println(removeDuplicates(sentence));
        }

        scanner.close();
    }

    public static String removeDuplicates(String sentence){

        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
        }
        return sentence;
    }
}
