package com.sorting;

public class LC_FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums){
        // Cycle Sort while ignoring negatives and numbers greater than N
        int i = 0;
        while( i < nums.length){
            if((nums[i] > 0) && (nums[i] < nums.length)){ // Runs only when the nums[i] is not negative and is smaller than lenght of array
                int correct = nums[i] - 1;
                if((nums[i] == nums[correct])){
                    i++;
                } else {
                    // Handles our requirements
                    swap(nums, i, correct);
                }
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return (j+1);
            }
        }

        return (nums.length+1);
    }

    static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
