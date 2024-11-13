package com.functions;

import java.util.Scanner;

public class Main {
    /*
        Syntax of a function -
        return_type name (arguments) {
            return statement
        }
    */

    public static void main(String[] args) {
        // Anything you want to use in static has to be static as well.
        sum(); // Function Call
        int multi = multiply();
        System.out.println("Multiplication - " + multi);
        String greet = greeting();
        System.out.println(greet);
        System.out.println(sum_with_params(23,45,67));
    }

    static void sum(){
        // We use void when we don't have to return anything.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }

    static int sum_with_params(int a, int b, int c){
        return a+b+c;
    }

    static int multiply(){
        // To return a string value, we have to specify the data type as int
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        return num1*num2;
    }

    static String greeting(){
        return "Hello User";
    }
}
