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
            // Checking if item is not the maximum one, because it will go out of bounds
            // Also checking if the item is at the wrong place
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                // Automatiically handled the case when the value is at the correct positons
                // Also handles when item is the max one, i.e. equal to the array lenght, so it has to be ignored
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
