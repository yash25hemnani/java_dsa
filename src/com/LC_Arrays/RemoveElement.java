package com.LC_Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,3,1,1,0,1,3,0,3,3,1,1};
        System.out.println(removeElement(nums, 1));
    }

    static int removeElement(int[] nums, int val) {
        // Using Two Pointer Approach
        // We start from front and back, each time the front pointer encounters a num == val, it will
        // switch it with back pointer and move it backwards
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            if (nums[end] == val){
                end--;
            }

            if(nums[start] == nums[end]){
                end--;
            }

            if (nums[start] == val && end>0 && nums[end] != val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }

            start++;
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                return i;
            }
        }

        return nums.length+1;
    }
}
