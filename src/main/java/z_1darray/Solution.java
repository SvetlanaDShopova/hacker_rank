package z_1darray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] a = new int[n];

        for(int i = 0 ; i <n; i++){
            a[i] = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println(a[i]);
        }
        bufferedReader.close();
    }
}
