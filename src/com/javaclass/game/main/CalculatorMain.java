package com.javaclass.game.main;

import com.javaclass.game.util.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(calc.add(5, 10));
//        System.out.println(calc.subtract(5, 10));
//        System.out.println(calc.multiply(5, 10));
//
//        Calculator calc2 = new Calculator();
//        calc2.setFirstNumber(10);
//        calc2.setSecondNumber(20);

        Calculator calc2 = new Calculator();
        // No numbers initialized
        System.out.println(calc2.add());

        // Calls the parameterized constructor and initializes the numbers
        Calculator calc3 = new Calculator(100, 200);
        System.out.println(calc3.add());

        // Calls the default constructor
        Calculator calc4 = new Calculator();

        // Explicity setting the numbers by calling the 'setter' methods
        calc4.setFirstNumber(10);
        calc4.setSecondNumber(20);


        System.out.println(calc4.add());

    }
}
