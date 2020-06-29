package com.multiplatform;

public class Animal {
    private String name;
    private int body;
    private int brain;
    private int height;

    public Animal(String name, int body, int brain, int height) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.height = height;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void move(int speed){
        System.out.println("Animal is moving with speed " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getHeight() {
        return height;
    }
}
