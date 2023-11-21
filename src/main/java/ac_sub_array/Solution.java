package ac_sub_array;

import java.util.Scanner;

public class Solution {
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        int arrayLength = Integer.parseInt(scan.nextLine());
        int[] nums = new int[arrayLength];
        String[] inputNumbers = scan.nextLine().trim().split(" ");
        if(arrayLength > 0){
            for(int i = 0; i < arrayLength; i++){

                nums[i] = Integer.parseInt(inputNumbers[i]);
            }
        }
        sumSubarray(nums, 0, 0) ;

        System.out.println(counter);

    }

    public static void sumSubarray(int[] nums, int start, int end){
        if(end == nums.length){
            return;
        } else if( start > end){
            sumSubarray(nums, 0, end +1);
        } else {
            int sum = 0;
            for(int i = start; i < end ; i ++){
                sum += nums[i];
            }
            sum += nums[end];
            if(sum < 0){
                counter++;
            }
            sumSubarray(nums, start + 1, end);
        }
        return;
    }
}
