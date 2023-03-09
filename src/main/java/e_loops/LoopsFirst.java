package e_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] multipliers = new int[]{1,2,3,4,5,6,7,8,9,10};
        int number = Integer.parseInt(bufferedReader.readLine().trim());
        if( number >= 2 && number <=20 ){
            for(int multiplier : multipliers){
                System.out.println(number + " x " + multiplier + " = " + (multiplier*number));
            }
        } else {
            throw new IllegalArgumentException("Only numbers between 2 and 20 incisively are allowed");
        }
        bufferedReader.close();
    }
}
