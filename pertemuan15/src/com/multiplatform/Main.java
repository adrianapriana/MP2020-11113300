package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Fish mujair = new Fish("Mujair", 10, 2, 2);
        mujair.eat();
        mujair.sleep();
        mujair.move(5);

        Dog husky = new Dog("Husky", 10, 2, 4, 1);
        husky.eat();
        husky.sleep();
        husky.move(10);
    }
}
