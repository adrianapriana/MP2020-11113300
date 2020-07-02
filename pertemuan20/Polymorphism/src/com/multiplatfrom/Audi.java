package com.multiplatfrom;

public class Audi extends Car{

    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine() {
        System.out.println("Audi r8 Engine Started");
    }

    public void accelerate() {
        System.out.println("Audi r8 Accelerated");
    }

    public void brake() {
        System.out.println("Audi r8 Stopped, brakes applied");
    }
}
