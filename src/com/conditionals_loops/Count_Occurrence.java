package com.conditionals_loops;

import java.util.Scanner;

public class Count_Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = in.nextLong();
        System.out.println("Enter the number to find: ");
        int to_find = in.nextInt();
        int count = 0;

        while(num > 0){
            if(num % 10 == to_find){
                count++;
            }
            num /= 10;
        }

        System.out.println("The number of occurances of " + to_find + " are " + count);
    }
}
