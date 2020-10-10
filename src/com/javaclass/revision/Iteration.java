package com.javaclass.revision;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        whileExample2();
        doWhileExample();
        // forExample2();

    }

    public void hello() {
        System.out.println("Hello from package 'iteration'");
    }

    public static void doWhileExample() {
        String name = "exit";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            System.out.println("Hello " + name);
        } while(!name.equals("exit"));
    }

    public static void forExample2(){
        int i=0;

        for(i = 0; i <= 100; i++) {
            System.out.println("Value of i = " + i);
            i = i+2;
        }

        System.out.println("Value of i = " + i);
    }

    public static void forExample(){
        for(int i=0; i<10; i = i+2) {
            System.out.println("Value of i = " + i);
        }

    }

    public static void whileExample2() {
        String name = "";
        Scanner scanner = new Scanner(System.in);

        while(!name.equals("exit")) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            System.out.println("Hello " + name);
        }
    }

    public static void whileExample1() {
        // while loop : used to itreate ove something until a condition becomes false
        int counter = 10;
        int i = 0;

        while(i < counter) {
            System.out.println("Hi - value of i = " + i);
            // i = i+1;
            i++;
        }
    }
}
