package com.searching;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int target = -1;
        int first = 0;
        int last = binarySearchIndex(arr, target)-1;

        int[] ans = {0,0};

        while(first < last){
            if (arr[first] + arr[last] == target){
                ans[0] = first;
                ans[1] = last;
                break;
            } else if (arr[first] + arr[last] > target){
                last--;
            } else {
                first++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    static int binarySearchIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid-1;
            } else {
                // Even if equal to target, we need the next largest element
                start = mid+1;
            }
        }

        return start; // Explained in Previous Questions
    }


}
