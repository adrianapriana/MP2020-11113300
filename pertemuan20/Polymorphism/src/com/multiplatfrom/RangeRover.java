package com.multiplatfrom;

public class RangeRover extends Car{
    public RangeRover(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine() {
        System.out.println("RangeRover Engine Started");
    }

    public void accelerate() {
        System.out.println("RangeRover Accelerated");
    }

    public void brake() {
        System.out.println("RangeRover Stopped, brakes applied");
    }
}
