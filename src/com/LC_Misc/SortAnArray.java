package com.LC_Misc;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{-1,2,-8,-10})));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[left.length + right.length];

        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            mergedArray[k] = right[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
