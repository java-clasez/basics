package com.javaclass.game.util;

import java.util.Random;
import java.util.Scanner;

public class Game {

    // This is to hold the number that the 'com.javaclass.game.util.Game' class selected (thought of)
    private int gameSelectedNumber;
    private int numberOfAttempts = 0;
    private int maxAttempts = 10;

    // Setter - does not return anything (return type is 'void')
    public void setMaxAttempts(int num) {
        maxAttempts = num;
    }

    // Getter - will return the value of the property/field (return type is the same as the type of the field)
    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void start() {
        // Print a welcome message
        System.out.println("Hello there! Let's play a game. You have " + maxAttempts  + " attempts to guess the number that I have in mind.");
        System.out.println("Here we go ...");

        // 'Select' a number for this session
        Random randomGenerator = new Random();
        gameSelectedNumber = randomGenerator.nextInt(100);

        while(numberOfAttempts < maxAttempts) {
            // Ask the user for a number
            int guess = getUserInput();

            // Count this as an attempt
            numberOfAttempts++;

            // Check if the number is correctly guessed
            if (guess == gameSelectedNumber) {
                System.out.println("Congratulations - You guessed it in " + numberOfAttempts + " attempts");
                System.exit(0);
            } else {
                // Check is any attempts left
                if (numberOfAttempts < maxAttempts) {
                    if (guess > gameSelectedNumber) {
                        System.out.println("Your guess is higher!");
                    } else {
                        System.out.println("Your guess is lower!");
                    }
                } else {
                    // print the Sorry message with the gameSelectedNumber
                    System.out.println("Sorry - you ran out of attempts. The number was : " + gameSelectedNumber);
                }
            }
        }
    }

    private int getUserInput() {
        System.out.println("Enter your guess : ");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        return userGuess;
    }

    public String getVersion() {
        return "v1.0.1";
    }
}
