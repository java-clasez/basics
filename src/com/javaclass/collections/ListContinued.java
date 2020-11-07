package com.javaclass.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListContinued {
    public static void main(String[] args) {

        // String[] arrayOfNames = new String[10];
        // arrayOfNames[0] = "ABC";

        ArrayList<String> listOfFruits = new ArrayList<>();
        // ArrayList<String> myList = new ArrayList<>();

        listOfFruits.add("Apple");
        listOfFruits.add("Apple");
        listOfFruits.add("Apple");
        listOfFruits.add("Apple");
        listOfFruits.add("Orange");
        listOfFruits.add("Grapes");
        listOfFruits.add("Orange");
        listOfFruits.add("Grapes");
        listOfFruits.add("Pear");
        listOfFruits.add("Pear");
        listOfFruits.add("Apple");
        // listOfFruits.add(100);
        // listOfFruits.add(true);

        System.out.println("Before sorting:");
        System.out.println(listOfFruits);

        Collections.sort(listOfFruits);  // This will sort the list
        System.out.println("After sorting:");
        System.out.println(listOfFruits);

        // How many fruits are there in the list?
        System.out.println("There are " + listOfFruits.size() + " fruits in the list");

        // How many types of fruit are there in the list
        int uniqueFruits = 0;

        String previousFruit = listOfFruits.get(0);
        uniqueFruits = 1;

        // This logic will ONLY work if the list is sorted

        for(int i=0; i<listOfFruits.size(); i++) {
            String currentFruit = listOfFruits.get(i);

            if(!currentFruit.equals(previousFruit)) {
               uniqueFruits++;
               previousFruit = currentFruit;
            }
        }

        System.out.println("Unique types " + uniqueFruits);

        // NOTE: !! IMPORTANT !! Remember - the order of insertion is retained in Lists.
        // listNames = ['Apple', 'Grapes', 'Orange', 'Pear']
        // listCounts = ['5, 2, 2, 2]
        // While printing you can be sure that each element corresponds to the correct value
        // listNames[i] + " : " + listCounts[i]

        // Print how many of each type of fruit is there. Output should be something like
        // TOTAL Fruits    : 11
        // TYPES of Fruits : 4
        // Apple  : 5
        // Grapes : 2
        // Orange : 2
        // Pear   : 2
    }
}

