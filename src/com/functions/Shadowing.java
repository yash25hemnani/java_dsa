package com.functions;

public class Shadowing {
    static int x = 90; // to use it in a static function, we need to make it static.

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;
        // SCope will begin once the variable is initialized.
        // Thus, System.out.println(x); will give an error here.
        x = 40; // This will shadow the variable in the higher scope.
        System.out.println(x); // 40a
    }
}
