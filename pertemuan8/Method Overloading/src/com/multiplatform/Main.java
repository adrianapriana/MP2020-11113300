package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //Method Overloading
        sum();
    }
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
    public static int sum(int a, double b){
        return  a + (int) b;
    }
    public static int sum(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    public static int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }
}
