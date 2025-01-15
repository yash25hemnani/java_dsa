package com.subset_subsequence;

import java.util.ArrayList;
import java.util.List;

public class MaxSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }

    static int max = Integer.MIN_VALUE;

    static int maxSubArray(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : nums){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(outer.get(i));
                newSubset.add(num);
                outer.add(newSubset);

                int sum = arraySum(newSubset.toArray(new Integer[0]));

                if (sum > max){
                    max = sum;
                }
            }
        }

        return max;
    }

    static int arraySum(Integer[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
