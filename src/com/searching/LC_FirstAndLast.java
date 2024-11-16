package com.searching;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1453967839/


import java.util.Arrays;

public class LC_FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,9};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target){
        // Searching the first element
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                // Logic is to store the mid value you get an since you want to find the first occurance you move to the left segment.
                first = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Searching the second element
        start = 0;
        end = nums.length - 1;
        int last = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                // Logic is to store the mid value you get and since you want to find the last occurance you move to the right segment.
                last = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // This is how you initialize and return an array
        return new int[]{first, last};
    }
}
