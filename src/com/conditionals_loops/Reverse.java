package com.conditionals_loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int reverse = 0;
        int temp = num;
        while(temp > 0){
            int last = temp%10;
            reverse = reverse*10 + last;
            temp = temp/10;
        }

        System.out.println("Reversed number is " + reverse);
    }
}
