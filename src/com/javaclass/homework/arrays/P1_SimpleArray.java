package com.javaclass.homework.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * PROBLEM STATEMENT
 * - Create a program to store 10 numbers in an array
 *     - print the entire array
 *     - print a specific element (remember to use the 'position' and 'index' correctly)
 *     - print the length of an array
 */
public class P1_SimpleArray {
    public static void main(String[] args) {
        int[] numArray = getArray();
        System.out.println(Arrays.toString(numArray));
    }

    private static int[] getArray() {
        // PROBLEM 1: Store 10 numbers in an array
        // Approach 1
        // int[] numbers = new int[10];

        // Approach 2
        // int[] numbers = {1,2,3,4,5,6,7,8,9,10}; // Note the length is automatically derived here

        // Approach 3
        int[] numbers = new int[10]; // Array length 10 - index from 0 to 9
        for(int i=0; i<10; i++) {
            numbers[i] = i+1;  // Adding one as we want to store 1,2,3,4 ... and indexes start from 0.
        }

        return numbers;
    }

    private static int getElementByIndex(int[] array, int index) {
        return array[index];
    }

    private static int getElementByNumericPosition(int[] array, int position) {
        return array[position - 1];
    }

    private static int getEaaryLength(int[] array) {
        return array.length;
    }
}
