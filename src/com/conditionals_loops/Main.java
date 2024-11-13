package com.conditionals_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if (salary > 10000){
            System.out.println("You received a bonus of 1000");
        } else {
            System.out.println("No Bonus");
        }
    }
}
