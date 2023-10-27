package aa_2darray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = bufferedReader.readLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxSum =getMaxSum(arr);

        System.out.println(maxSum);

        bufferedReader.close();
    }

    private static int getMaxSum(int[][] arra) {
        int maxSum = -63;

        for(int i = 0; i < arra.length-2; i ++){
            for(int j = 0; j < arra[i].length - 2; j++){
                int second =arra[i][j + 1] ;
                int third = arra[i][j + 2];
                int stem = arra[i+1][j + 1];
                int forth = arra[i+2][j];
                int fifth = arra[i+2][j+1];
                int sixth = arra[i+2][j+2];

                int sum = arra[i][j] + second + third + stem + forth + fifth + sixth;
                if(sum >= maxSum){
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
