package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int convertBytes = kiloBytes;
            int megaByte = (convertBytes / 1024);
            int remainkiloBytes = (convertBytes % 1024);
            System.out.println(convertBytes + "  = " + megaByte + " MB and " + remainkiloBytes + " KB");
        }
    }

    public static void printEqual (int a, int b, int c){
        if ((a < 0) || (b < 0) || (c < 0)){
            System.out.println("Invalid Value");
        } else if((a == b) && (a == c)) {
            System.out.println("All numbers are equal");
        } else if((a == b) && (a != c)){
            System.out.println("All number are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
