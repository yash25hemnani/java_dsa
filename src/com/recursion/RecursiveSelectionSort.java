package com.recursion;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,5};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int row, int col, int max){
        // Again taking reference from pattern printing question
        // Keeping track of max index
        if (row == 0){
            return;
        }

        if (col < row){
            if (arr[max] < arr[col]){
                selectionSort(arr, row, col+1, col);
            } else {
                selectionSort(arr, row, col+1, max);
            }
        } else {
            // Swap the max indexed element with the last element
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;

            selectionSort(arr, row-1, 0, 0);
        }
    }
}
