package com.strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 4543.127245f;
        // Somewhat similar to C and C++
        System.out.printf("Formatted Number is %.2f", a); // Print till 2 space
        System.out.println();
        System.out.printf("Pie: %.3f", Math.PI); // Print till 3 decimal spaces
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s", "Yash", "Awesome");;

        // There can be many placeholders in Java
    }
}
