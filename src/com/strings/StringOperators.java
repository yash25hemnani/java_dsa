package com.strings;

import java.util.ArrayList;

public class StringOperators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // Converts to ASCII and add
        System.out.println("A" + "B"); // Strings will be concatenated
        System.out.println((char)('a' + 3)); // Prints d, ASCII of 'a' + 3 = 'd'

        System.out.println("a" + 1); // prints a1
        // Integer will be converted to Integer Wrapper Class, that will call toString()

        System.out.println("Yash" + new ArrayList<>()); // Prints Yash[] as the second object is converted to string
        // If any object is concatenated to a string, the object will internally call it's two string value

        // IMPORTANT!!!
        // + in java can only be used with primitives and you can use this with complex objects as well, given that atleast one of the object is a string.
        // String ans = new Integer(56) + new ArrayList<>() // This will not work
        String ans = new Integer(56) + "" + new ArrayList<>(); // This will work
        System.out.println(ans);

        // When you do something like sout("a" + "b"), a new object is created temporarily and printed, after which it goes in garbage collection


    }
}
