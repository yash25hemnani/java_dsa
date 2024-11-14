package com.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,25,46,34,23,34,54};
        int target = 23;

        int ans = linear_search(arr, target);
        System.out.println(ans);
    }

    static int linear_search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return 0;
    }
}
