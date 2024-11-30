package com.strings;

import java.util.Arrays;

public class Comparision {
    public static void main(String[] args) {
        String a = "Yash";
        String b = "Yash";
        String c = a;
        System.out.println(a == b);
        System.out.println(c == b);

        // Creates difference objects outside the pool but inside the heap
        String name1 = new String("Yash");
        String name2 = new String("Yash");

        System.out.println(name1 == name2); // Gives false as ref variable is checked
        System.out.println(name1.equals(name2)); // This will be true as value is compared

        System.out.println(56); // This will print a string, anything you put in println, it will be converted to string then printed
        System.out.println(new int[]{1,2,3,4}); // This will print the string representation of the object, calls it's own toString method internally
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); // This will print the toString method of Arrays, that will pretty print it - Method Overriding

    }
}
