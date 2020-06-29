package com.multiplatform;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;

    public Dog(String name, int height, int eyes, int legs, int tail) {
        super(name, 1, 1, height);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    public void walk(int speed){
        System.out.println(getName() + " is walking with speed " + speed);
    }

    public void run(int speed){
        System.out.println(getName() + " is running with speed " + speed);
    }

    @Override
    public void move(int speed) {
        if(speed <= 5){
            this.walk(speed);
        }else{
            this.run(speed);
        }
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}
