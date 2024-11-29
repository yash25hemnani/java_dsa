package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findAllDuplicates(nums);
        System.out.println(Arrays.toString(nums));

    }

    static List<Integer> findAllDuplicates(int[] nums) {
        // Using cycle sort
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                result.add(nums[j]);
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
