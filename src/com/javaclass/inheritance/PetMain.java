package com.javaclass.inheritance;

public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bo");
        dog.setType("Dog");
        System.out.println("Name " + dog.getName());
        System.out.println("Type " + dog.getType());

        // System.out.println("Name " + dog.getClass().getName());
        dog.move();
        dog.speak();
        dog.sleep();

        System.out.println("------------------");

        Fish fish = new Fish();
        fish.setName("Nimo");
        fish.setType("Fish");
        System.out.println("Name : " + fish.getName());
        System.out.println("Type " + fish.getType());
        // System.out.println("Name : " + fish.getClass().getName());
        fish.move();
        fish.speak();
        fish.sleep();

        // String str = "Test";
        // System.out.println(str.getClass().getName());
    }
}
