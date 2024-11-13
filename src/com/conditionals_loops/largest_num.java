package com.conditionals_loops;

import java.util.Scanner;

public class largest_num {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max + " is the largest of all numbers");

        // Or you can use Math.max
        int math_max = Math.max(c, Math.max(a,b));
        System.out.println(math_max);
    }
}
