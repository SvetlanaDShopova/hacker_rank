package z_1darray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

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
