package com.functions;

public class Scope {
    public static void main(String[] args) {
        // Block Scope - Values initialized inside a block, will remain in the block.
        int a = 10;
        int b = 20;

        {
            a = 100; // You can change the values of the parent scope variable.
            int c = 100; // This can't be accessed outside the scope.
        }

        // System.out.println(c); - This will give an error.
    }
}
