package Day34_WrapperClasses;

import java.util.Scanner;

public class WrapperClass_Practice2 {

    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        System.out.println("===========================");

        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            int n = input.nextInt();

            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
