package com.array_arraylist;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,43,56,2,52,34};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}
