package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={2, -32, 4,5,90};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) { // effectively running till n-2 since we are using less than
            for (int j = i+1; j > 0 ; j--) {
                if(array[j] < array[j-1]){
                    swap(array, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
