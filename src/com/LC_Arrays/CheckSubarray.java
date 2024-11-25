package com.LC_Arrays;
//https://leetcode.com/problems/continuous-subarray-sum/description/


import java.util.ArrayList;
import java.util.Arrays;

public class CheckSubarray {
    public static void main(String[] args) {
        int[] nums = {23,6,9};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        // Calculating Prefix Sum from each value
        // 23,2,6,4,7 --> from 23 --> 23,25,31,35,42
        // 23,2,6,4,7 --> from 2 --> 2,8,12,19
        // 23,2,6,4,7 --> from 6 --> 6,10,17
        // 23,2,6,4,7 --> from 4 --> 4,11

        // This way we would have explored all possible outcomes
        int prefix = 0;

        for (int i = 0; i < nums.length-1; i++) { // Run array till second last element
            for (int j = i; j < nums.length; j++) {
                prefix += nums[j];
                System.out.println(prefix);
                if(prefix % k == 0 && j!=i){ // j!=i because when j==i, it the first element and we need pairs only
                    return true;
                }
            }

            // Reload prefix before incrementing the ith index
            prefix=0;
        }

        // If not found, return false;
        return false;
    }
}
