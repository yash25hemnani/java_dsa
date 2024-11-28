package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2, -32};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            // Find the maximum item in the remaining array and swap this with correct index

            int last = array.length - i - 1;
            int maxIndex = getMaxIndex(array, 0, last);

            swap(array, maxIndex, last);

        }
    }

    static int getMaxIndex(int[] array, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (array[max] < array[i]){
                max = i; // Index needed
            }
        }
        return max;
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
