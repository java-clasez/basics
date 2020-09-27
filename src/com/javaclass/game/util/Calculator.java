package com.javaclass.game.util;

public class Calculator {
    // Requirment
    // should be able to add two numbers
    // should be able to find the difference in two numbers
    // should be able to multiply two numbers

    // Special keyword 'this'
    // 'this' - 'the instance/class'

    int firstNumber = 0;
    int secondNumber = 0;

    public Calculator(){
    }

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}
