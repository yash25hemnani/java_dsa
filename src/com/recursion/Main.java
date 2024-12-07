package com.recursion;

public class Main {
    public static void main(String[] args) {
        // Check notes
        // Make a Recursive function to print numbers upto 5
        print(1);
    }

    static void print(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n+1);
    }
}
