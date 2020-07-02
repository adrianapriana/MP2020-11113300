package com.multiplatfrom;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(){
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    public void accelerate() {
        System.out.println("Car Accelerated");
    }

    public void brake() {
        System.out.println("Car Stopped, brakes applied");
    }

}
