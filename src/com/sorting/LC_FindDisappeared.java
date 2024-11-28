package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_FindDisappeared {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappeared(nums);
        System.out.println(Arrays.toString(nums));

    }

    static List<Integer> findDisappeared(int[] nums) {
        // Using cycle sort
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if((i == correct) || (nums[i] == nums[correct])){
                i++;
            } else {
                swap(nums, i, correct);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1 != j){
                result.add(j+1);
            }
        }
        return result;
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
}
