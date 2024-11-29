package com.sorting;

import java.util.Arrays;

public class LC_SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums){
        // Cycle Sorting
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Loop through the array
        for (int j = 0; j < nums.length; j++) {
            // The first item in the index is return the duplicate number and second returns the correct number
            if(nums[j] != j+1){
                return new int[]{nums[j], j+1};
            }
        }

        return new int[]{-1,-1};
    }

    static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
