package w_big_decimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        sort(s);

        //Output
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }

    public static void sort(String[] array){
        int length = array.length -2 ;
        for (int i = 0; i < length; i++) {
            BigDecimal currentNumber = new BigDecimal(array[i]);
            for (int j = 0; j < length; j++) {
                BigDecimal comp = new BigDecimal(array[j]);
                if (currentNumber.compareTo(comp) > 0) {
                    String temp = array[j];
                    array[j] =  array[i];
                    array[i] = temp;
                    currentNumber = new BigDecimal(array[j]);
                }
            }
        }
    }
}
