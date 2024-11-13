package com.array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        // Here you have to pass the wrapper classes, and can't pass things like int, char etc.

//        list.add(25);
//        list.add(2523);
//        list.add(255);
//        list.add(55);
//
//        // To print
//        System.out.println(list); // calls the toString method internally

//        System.out.println(list.get(2)); // Get the item at index 2

        // Taking input using for loop
        for (int i = 0; i < 5; i++) {
            int num = in.nextInt();
            // list.set(i, num); // set is used to update a value
            list.add(num);
        }

        // Showing output using for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        // To create a multidimensional array list -
        // Remember it is an arraylist of arraylists (1st datatype = arraylist,
        // second will be the data type of internal array list

        ArrayList<ArrayList<Integer>> multi = new ArrayList<>(10);

        // Initializing, without which all values will be null
        for (int i = 0; i < 3; i++) {
            multi.add(new ArrayList<>());
            // Adding an array list to the multi ArrayList
        }

        // Adding element in each array list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multi.get(i).add(in.nextInt());
            }
        }

    }
}
