package Day20_While_Loop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < 100; ){
            System.out.println("Enter a number: ");
            int num =   scan.nextInt();
            if(num<0){
                break;
            }
            sum += num;  // in the loop body
        }
        System.out.println("sum is: "+sum);
            }
}
