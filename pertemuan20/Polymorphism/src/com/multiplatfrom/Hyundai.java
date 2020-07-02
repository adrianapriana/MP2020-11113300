package com.multiplatfrom;

public class Hyundai extends Car{
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine() {
        System.out.println("Hyundai Engine Started");
    }

    public void accelerate() {
        System.out.println("Hyundai Accelerated");
    }

    public void brake() {
        System.out.println("Hyundai Stopped, brakes applied");
    }
}
