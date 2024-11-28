package com.sorting;

public class LC_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] nums) {
        // Using cycle sort to sort
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (!(nums[i] == i)){
                return i;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums, int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
}
