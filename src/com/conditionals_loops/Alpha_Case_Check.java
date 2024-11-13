package com.conditionals_loops;

import java.util.Scanner;

public class Alpha_Case_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        int ord = (int) ch;
        // A - 65, a = 97
        // Z - 90, z = 122

        if (ord >= 65 && ord <= 97){
            System.out.println(ch + " is in uppercase.");
        } else {
            System.out.println(ch + " is in lowercase.");
        }
    }
}
