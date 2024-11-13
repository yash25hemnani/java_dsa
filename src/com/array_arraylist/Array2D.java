package com.array_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        // Syntax
        int[][] nums = new int[3][3];
        // We need not provide the size of the columns
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // The size of arrays in the array may be variable
        int[][] var_arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
        };

        // Length of array - no of rows
        // Length of element of array - no of cols
        Scanner in = new Scanner(System.in);
        // taking input using for loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // taking output using for loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // using toString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // using for each
        for (int[] a: arr) { // in for each, you need to specify the data type for the element, which is array in this case
            System.out.println(Arrays.toString(a));
        }
    }
}
