package day08_LogicalOperators;
/*
write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

 */
public class GallonsToLiters {

    public static void main(String[] args) {

        double gallons = 15;
        double liters = gallons * 3.785;

        System.out.println(gallons + " gallons equal to " +liters+ " liters.");

        double lts = 200;
        double gals = lts / 3.785;

        System.out.println(lts + " liters equal to " +(int)gals+ " gallons."); // casting double into int and it will
                                                                // give whole numbers which is the approximate number.!






    }
}
