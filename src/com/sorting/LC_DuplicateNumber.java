package com.sorting;

import java.util.Arrays;

public class LC_DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int findDuplicate(int[] nums){
        int i = 0;
        // sorting using cycle sort
        while(i < nums.length){
            int correct = nums[i] - 1;
            if((i == correct) || (nums[i] == nums[correct])){
                i++;
            } else {
                swap(nums, i, correct);
            }
        }

        return nums[nums.length-1];
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
