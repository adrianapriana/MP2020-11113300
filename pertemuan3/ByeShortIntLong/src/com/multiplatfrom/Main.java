package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Overflow Max Value = " + (myMaxIntValue + 1));
        System.out.println("Underflow Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        short myShortValue = 10000;
        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Max Value = " + myMaxShortValue);
        System.out.println("Short Max Value = " + myMinShortValue);

        byte myByteValue = (byte) 10000;
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Max Value = " + myMaxByteValue);
        System.out.println("Byte Max Value = " + myMinByteValue);

        long myLongValue = 10000L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Max Value = " + myMaxLongValue);
        System.out.println("Long Max Value = " + myMinLongValue);
    }
}
