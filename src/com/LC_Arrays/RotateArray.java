package com.LC_Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {-1,-100,5,3,99};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        // Logic = [1,2,3,4,5,6,7]
        // k = 3
        // Reverse (n-3, n) and (0, n-3)
        // [4,3,2,1,7,6,5]
        // Run loop, swap front and back
        // [5,6,7,1,2,3,4]
        if(k > nums.length){
            k = k - nums.length;
        }

        if(nums.length != 1 && k>0 && k!=nums.length){
            reverse(nums, 0, nums.length-k-1);

            reverse(nums, nums.length-k, nums.length-1);


            for (int i = 0; i < k; i++) {
                swap(nums, i, nums.length - i - 1);
            }
        }
    }

    static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
