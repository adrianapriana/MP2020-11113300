package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {
        printMessage("John");
        int res = addition(0, 0);
        System.out.println("Result = " + res);

        System.out.println("Return Value = " + toMilesPerHour(1.5));
        System.out.println("Return Value = " + toMilesPerHour(10.5));
        System.out.println("Return Value = " + toMilesPerHour(-5.6));
        System.out.println("Return Value = " + toMilesPerHour(25.42));
        System.out.println("Return Value = " + toMilesPerHour(75.114));


        Main.printConversion(1.5);
        Main.printConversion(10.5);
        Main.printConversion(-5.6);
        Main.printConversion(25.42);
        Main.printConversion(75.114);

        
//number 3
        double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("rounded= " + rounded);
        System.out.println("with 3.9= " + Math.round(3.9));
        System.out.println("with 4.5= " + Math.round(4.5));
        int sum = 45;
        int count = 10;
        // typecasting so result is double e.g. double / int -> double
        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("average= " + average);
        System.out.println("roundedAverage= " + roundedAverage);

    }

    public static void printMessage(String name){
        System.out.println("Hello " + name);
    }
    public static int addition(int a, int b){
        if(a == 0 && b == 0){
            return -1;
        }
        int result = a + b;
        return result;
    }

//number 1
    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }
//number 2
    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ milesPerHours +" mi/h");
        }
    }
}



