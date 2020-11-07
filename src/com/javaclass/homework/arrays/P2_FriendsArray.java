package com.javaclass.homework.arrays;

import java.util.Scanner;

public class P2_FriendsArray {
    public static void main(String[] args) {
        P2_FriendsArray p2 = new P2_FriendsArray();
        int count = p2.getNumberOfEntries();
        System.out.println(count);
    }

    /**
     * Get number of friends the user wants to enter
     * @return
     */
    private int getNumberOfEntries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of friends you wan to enter: ");
        int num = scanner.nextInt();
        return num;
    }

}
