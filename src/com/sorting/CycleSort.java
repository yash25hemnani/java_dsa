package com.sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,6,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        // Move i pointer when i is at the correct index
        int i = 0;
        while(i < arr.length){
            if(i == (arr[i] - 1)){
                i++;
            } else {
                swap(arr, i, arr[i] - 1); // swap the item at i with the item at arr[i] - 1
            }

            // Another method
//            int correct = arr[i] - 1;
//            if(arr[i] != arr[correct]){
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
