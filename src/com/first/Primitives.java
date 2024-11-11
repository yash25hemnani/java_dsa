package com.first;

// Primitive is basically any data type you can not break further
public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64;
        char letter = 'r';
        float marks = 98.67f; // Add f in end. Why? Because by default they are of type double. So we use f to specify it as float
        double largeDecimalNumbers = 45868934.4375;
        long largeIntegerValues = 123453453456L; // Add L in end. By default, it is of type int.
        boolean check = true;

        // String is not primitive as it can be broken into chars
        String name = "Yash";

        // Even though they are primitive, we can use Wrapper classes to create them as well.
        // Provides extra functionality
        Integer roll_number = 64;
    }
}
