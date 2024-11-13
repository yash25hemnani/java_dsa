package com.basics;

import java.util.Scanner;
public class Input_Java {
    public static void main(String[] args) {
        // Scanner is public as well, that is why we can use it anywhere.
        Scanner input = new Scanner(System.in);
        // System.in - means the standard input stream i.e. keyboard
        System.out.println(input.nextInt()); // Takes only int values
        // System.out.println(input.next()); // takes string input until it encounters a space
        System.out.println(input.nextLine()); // takes string input completely

    }
}
