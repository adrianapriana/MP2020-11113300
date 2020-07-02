package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {
    Car car = new Car();
    new Car().startEngine();
    new Car().accelerate();
    new Car().brake();

    Car audi = new Audi("r8", 4);
    System.out.println(audi.getName() + " has " + audi.getCylinders() + " cylinders.");
    audi.startEngine();
    audi.accelerate();
    audi.brake();

    Car hyundai = new Hyundai("i20", 5);
    System.out.println(hyundai.getName() + " has " + hyundai.getCylinders() + " cylinders.");
    hyundai.startEngine();
    hyundai.accelerate();
    hyundai.brake();

    Car rangeRover = new RangeRover("sport", 6);
    System.out.println(rangeRover.getName() + " has " + rangeRover.getCylinders() + " cylinders.");
    rangeRover.startEngine();
    rangeRover.accelerate();
    rangeRover.brake();

    }
}
