package com.functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(checkArm(num)){
            System.out.println("Number is Armstrong.");
        } else {
            System.out.println("Not Armstrong");
        }

    }

    static boolean checkArm(int num){
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp%10;
            sum += digit*digit*digit;
            temp /= 10;
        }

        return sum==num;
    }
}
