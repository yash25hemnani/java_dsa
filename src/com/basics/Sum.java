package com.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is " + sum);

        // Giving float values will give an error. However, this will give no error.
        // This is due to type coversion and type casting.
        float num3 = input.nextInt();
        float num4 = input.nextInt();

        int sum_float = num1 + num2;

        System.out.println("Sum is " + sum);
    }
}
