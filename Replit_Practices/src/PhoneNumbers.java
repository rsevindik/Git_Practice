import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        //YOUR CODE HERE
        Scanner input = new Scanner(System.in);

        int areaCode = input.nextInt();
        int localNumber = input.nextInt();

        String phoneNumber = "("+ areaCode +")-"+localNumber;
        System.out.println("Calling number " +phoneNumber);

    }
}
