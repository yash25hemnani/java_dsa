package com.array_arraylist;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        for (int i = 0; i < (arr.length)/2; i++) {
            swap(arr, i, (arr.length-1)-i);
        }
    }

}
