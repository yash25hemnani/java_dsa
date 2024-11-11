package com.first;

import java.util.Scanner;

public class TypeConCast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat(); // Even if you input an integer, it will work.
        // When one type of data is assigned to another type of variable, an automatic type conversion will take place if the
        // following two conditions are met:
        // • The two types are compatible.
        // • The destination type is larger than the source type.
        System.out.println(num);

        // So what if we had to convert a decimal to integer?
        // Type Casting
        int val = (int)(67.56f);
        System.out.println(val);

        // Automatic Type Promotion is Expressions
        int a = 257;
        byte b = (byte)(a); // Since max capacity of a byte is 256, storing 257 works like this - 257 % 256 = 1

        System.out.println(b);

        //Automatic Type Promotion in Expressions

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;
        int d = b1 * b2 / b3;

        System.out.println(d);
        // The output is 20. Now, b1 * b2 is 2000 which is way higher the size of byte. But it is still being evaluated.
        // This is because, Java is automatically promoting them to integers.

        int number = 'A';
        System.out.println(number); // Outputs the ASCII value - 65


    }
}
