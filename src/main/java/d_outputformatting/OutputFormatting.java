package d_outputformatting;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scanner.next();
            int x=scanner.nextInt();
            if(s1 != null && !s1.trim().isEmpty() && x >=0 && x <= 999){
                System.out.printf("%-15s%03d ",s1,x);
                System.out.println();
            } else {
                throw new IllegalArgumentException("Input is wrong. You could provide strings up to" +
                        " 10 characters and integers between 0 and 999");
            }
        }
        System.out.println("================================");
        scanner.close();
    }
}
