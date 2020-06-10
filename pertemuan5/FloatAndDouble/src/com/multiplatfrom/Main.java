package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value = " +myMinFloatValue);
        System.out.println("Maximum Float Value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value = " +myMinDoubleValue);
        System.out.println("Maximum Double Value = " +myMaxDoubleValue);

        int myIntegerNumber = 5/3;
        float myFloatNumber = 5.00f / 3.00f;
        double myDoubleNumber = 5.00d / 3.00d;
        System.out.println(myIntegerNumber);
        System.out.println(myFloatNumber);
        System.out.println(myDoubleNumber);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("Kilograms = " + kilograms);
        double pi = 3_000_000.1415927d;
    }
}
