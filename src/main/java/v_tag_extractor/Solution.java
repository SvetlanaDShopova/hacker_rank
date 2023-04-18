package v_tag_extractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            System.out.println(getTagContent(line));

            testCases--;
        }
        in.close();
    }

    public static String getTagContent(String line) {
        String tagExtract = "";
        String pattern ="\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
        Pattern p = Pattern.compile(pattern);
        Matcher m =  p.matcher(line);
        while(m.find())
        {
            if(tagExtract.length() >0){
                tagExtract += "\n";
            }
            tagExtract +=  m.group(2);
        }

        return tagExtract.isBlank() ? "None" : tagExtract;
    }
}
