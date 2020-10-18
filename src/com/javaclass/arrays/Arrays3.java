package com.javaclass.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // You can do any of the below
        String names[] = new String[2];  // Will create and array of two String elements and inititalize all elements with 'null'
        // String[] names = new String[2]; // Exactly the same as previous statement

        // You can initailze an array with the values right at the time of creating it
        // NOTE : we use '{' and '}' to specify the elements
        String[] names2 = { "John", "Peter", "Mac", "Amy"};
        System.out.println(names2[2]);

        String[] names3 = new String[4];
        names3[0] = "John";
        names3[1] = "Peter";
        names3[2] = "Mac";
        names3[3] = "Amy";


        // Example 1: I want to store numbers from 1 to 10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Example 2: I want to store ten numbers (note - we do not know what the numbers are/would be)
        int[] arr2 = new int[10];
    }
}

