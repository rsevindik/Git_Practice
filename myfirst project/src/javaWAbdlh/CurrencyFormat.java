public class CurrencyFormat {
    public static void main(String[] args) {

        double monthlyPay = 50000.0;
        double annualPay = monthlyPay * 12;
        System.out.printf("Your annual pay is $%,.2f\n",annualPay);


    }
}
