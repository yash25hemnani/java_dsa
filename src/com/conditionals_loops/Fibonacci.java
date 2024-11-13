package com.conditionals_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;

        System.out.println("Specify the number of items you want: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print("The fibonacci series is - " + f1 + " " + f2 + " ");

        // Implementation with For Loop
        for(int i = 0; i<n; i++){
            int next_f = f1 + f2;
            System.out.print(next_f + " ");
            f1 = f2;
            f2 = next_f;
        }

        // Implementation with While Loop
        int temp = 0;
        while(temp < n){
            int next_f = f1 + f2;
            System.out.print(next_f + " ");
            f1 = f2;
            f2 = next_f;
            temp++;
        }
    }
}
