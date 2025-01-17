package com.LC_Misc;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(isBalanced("1234"));
    }

    static boolean isBalanced(String num) {
        return (sumAtOdd(num) == sumAtEven(num));
    }

    static int sumAtOdd(String num){
        int oddSum = 0;
        for(int i = 0; i < num.length(); i+=2){
            int intVal = (int) num.charAt(i) - (int)'0';
            oddSum += intVal;
        }

        return oddSum;
    }

    static int sumAtEven(String num){
        int evenSum = 0;
        for(int i = 1; i < num.length(); i+=2){
            int intVal = (int) num.charAt(i) - (int)'0';
            evenSum += intVal;
        }

        return evenSum;
    }
}
