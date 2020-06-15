package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0));
        System.out.println(rectangle(5.0, 4.0));
        System.out.println(rectangle(-1.0, 4.0));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1;
    }
        return Math.PI * radius * radius;
    }
    public static double rectangle(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }
}
