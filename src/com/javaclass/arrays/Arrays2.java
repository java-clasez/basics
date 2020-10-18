package com.javaclass.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // Store names of five of our friends
        String[] friends = new String[5];
        //String friends[] = new String[5];

        friends[0] = "Amy";
        friends[1] = "Johanathan";
        friends[2] = "Peter";
        friends[3] = "Joy";
        friends[4] = "Abigail";

        System.out.println("friend 1 " + friends[0]);
        System.out.println("friend 2 " + friends[1]);
        System.out.println("friend 3 " + friends[2]);
        System.out.println("friend 4 " + friends[3]);
        System.out.println("friend 5 " + friends[4]);
        System.out.println("-----------------");

        // Change the element at postion 3 (index 2)
        friends[2] = "Parker";
        System.out.println("friend 1 " + friends[0]);
        System.out.println("friend 2 " + friends[1]);
        System.out.println("friend 3 " + friends[2]);
        System.out.println("friend 4 " + friends[3]);
        System.out.println("friend 5 " + friends[4]);

        int arrayLength = friends.length;

//        for(int i=0; i < arrayLength; i++) {
//            System.out.println("Friend " + friends[i]);
//        }
    }
}
