package com.Coding.Udemy;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {

    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 50;

    long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

    short shortTotal = (short) (1000 + 10 * // Java will see the bottom line!!
            (byteValue + shortValue + intValue));
        System.out.println(shortTotal);

}
}
