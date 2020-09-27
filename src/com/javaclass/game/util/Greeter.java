package com.javaclass.game.util;

public class Greeter {

    String name = "";

    public void setName(String name) {
        this.name = name;
    }

    // Polymorphism OR Method Overloading
    // sayHello()
    // sayHello("name")
    // sayHello("firstname", "lastname")

    // Method Signature
    // Method Name / Return Type / Parameters

    // Constructor : Java provides one for each class if you have not specified it in your code.

    // Constructor : Is a special method
    // - Does not have a return type
    // - has to have the same (exact) name as the class

    // Default Constructor (No parameters)
    public Greeter(){
        System.out.println("Creating greeter");
    }

    // Parameterized constructor
    public Greeter(String userName) {
        name = userName;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }

    public String sayHello(String name) {
        System.out.println("Hello " + name);
        return "Hello" + name;
    }

    public String sayHello(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

}
