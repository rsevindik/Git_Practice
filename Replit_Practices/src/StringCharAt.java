import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        System.out.print("" + txt.charAt(2) + txt.charAt(4) + txt.charAt(5));
    }
}