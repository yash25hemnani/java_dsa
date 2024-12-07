package com.LC_Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, -1};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        // Taking a variable named sum, and running two loops
        // The first loop will decide the subarray size
        // the second will take the sum and store the maximum in sum variable
        int sum = Integer.MIN_VALUE;
        int size = 0;
        int i = 0;

        while(size != nums.length){

            int temp_sum = 0;

            for (int k = i; k <= i+size; k++) {
                temp_sum += nums[k];
            }

            if(temp_sum >= sum){
                sum = temp_sum;
            }

            i++;
            if(i == nums.length-size){
                size++;
                i = 0;
            }

        }

        return sum;
    }
}
