package com.array_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax - data_type[] var_name = new data_type[size]

        int[] roll_nos = new int[5];

        // Taking input using for loops -
        for (int i = 0; i < roll_nos.length; i++) {
            roll_nos[i] = in.nextInt();
        }

        // Showing output using for loop -
        for (int i = 0; i < roll_nos.length; i++) {
            System.out.println(roll_nos[i]);
        }

        // Or you can use a more advanced version of it - for each loop
        for (int i : roll_nos){ // For every element in array, print the element
            System.out.println(i); // Here i represents the element of the array.
        }

        // Or you can do -
        System.out.println(Arrays.toString(roll_nos));
    }
}
