package day04_Variables;

public class Concate_Add {

    public static void main(String[] args) {

        // Addition: number + number
        System.out.println(12 + 13); // 25
        System.out.println('A' + 2); // 67
        System.out.println('A' + 'B'); // 131

        // Concatenation: result in append.!
        System.out.println("12" +13); // 1213
        System.out.println("A"+2); // A2
        System.out.println("Gender: " +'M');
        System.out.println("Tax:"+3.5+ '%');
        System.out.println(3.5+'%'+" Tax"); // 3.5 + 37(value for % sign) which is addition
                                           // then concatenation by adding String.!


    }
}
