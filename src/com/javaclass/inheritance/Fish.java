package com.javaclass.inheritance;

public class Fish extends Pet {
    @Override
    public void move() {
        System.out.println("I am swimming");
    }

    public void speak() {
        System.out.println("Fish Speak");
    }
}
