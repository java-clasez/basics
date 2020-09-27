package com.javaclass.game.main;

import com.javaclass.game.util.Game;
import com.javaclass.game.util.Greeter;

public class GameMain {
    // Read something on - How to extend a class in Java

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHello("John");
        String message = greeter.sayHello("John", "McClaine");
        System.out.println(message);

        greeter.setName("Michael");
        greeter.sayHello();

        // Using parameterized constructor
        Greeter greeter2 = new Greeter("Johnathan");
        greeter2.sayHello();


        Game game = new Game();
        game.setMaxAttempts(5);

        System.out.println("Max attempts set to " + game.getMaxAttempts());

        String version = game.getVersion();
        System.out.println("Starting Game Version " + version);
        game.start();
        System.out.println("Thanks for playing!");

    }
}
