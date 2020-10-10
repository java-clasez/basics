package com.javaclass.revision;

public class Overloading {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println(greeting.sayHello());
        System.out.println(greeting.sayHello("Ashish"));
        System.out.println(greeting.sayHello("Tom", "Cruise"));
        System.out.println(greeting.sayHello("Jim", true));
        System.out.println(greeting.sayHello("Jim", false));
    }
}

class Greeting {
    public String sayHello() {
        return "Hello";
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayHello(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    public String sayHello(String name, boolean isDay) {
        if(isDay) {
            return "Hello " + name + " Have a good day!";
        } else {
            return "Hello " + name + " Have a good night!";
        }
    }
}
