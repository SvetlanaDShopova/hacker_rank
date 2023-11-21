package ab_array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int numberLists = Integer.parseInt(scan.nextLine());
        List<List<Integer>> lists = new ArrayList<>();

        for(int i = 0; i < numberLists; i++){
            String lineNumber = scan.nextLine();
            String[] numStrings = lineNumber.split(" ");
            int listLength = Integer.parseInt(numStrings[1]);
            List<Integer> newList = new ArrayList<>();
            if(listLength > 0){
                for(int j = 1; j < listLength; j++){
                    System.out.println(j);
                    newList.add(Integer.parseInt(numStrings[j]));
                }
            }

            lists.add(newList);
            newList.forEach(System.out::println);
        }
    }
}
