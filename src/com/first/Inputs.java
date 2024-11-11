package com.first;

import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is " + rollNo);

        int a = 10;
        // data_type identifier = literal;

        // What if you want to write this - 234,000,000
        int b = 234_000_000; // underscore works as commas

    }
}
