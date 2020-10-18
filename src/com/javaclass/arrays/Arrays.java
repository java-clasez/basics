package com.javaclass.arrays;

public class Arrays {

    public static void main(String[] args) {
        // I want to create an array of 5 elements
        // IMPORTANT: In Java - you should know the number of elements (length) of an array in advance

        // Variable
        int i = 10;
        System.out.println(i);

        // Array (to store first 10 even numbers)
        // size : 10 elements - 10

        // Created an array
        int[] intArray = new int[10];  // Note the use of 'new' and the 'size'

        System.out.println(intArray); // This prints the address of the first element

        // Lets store first 10 even numbers in the array
        // First element
        intArray[0] = 2;

        // Second element (index 1)
        intArray[1] = 4;

        intArray[2] = 6;
        intArray[3] = 8;
        intArray[4] = 10;
        intArray[5] = 12;
        intArray[6] = 14;
        intArray[7] = 16;
        intArray[8] = 18;
        intArray[9] = 20;


        // value of the first element (index 0) - we need to use the index
        System.out.println(intArray[0]);

        // Lets print the second element
        System.out.println(intArray[1]);

        // Java allows you to check the 'length' of an array by using 'length' **property**
        System.out.println("Length of my array ; " + intArray.length);

        // Last index of the array will be 'length - 1'
        // This will print the last element of an array
        int len = intArray.length;
        System.out.println("Last element is : " + intArray[len - 1]);
    }

}

