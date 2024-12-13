package com.LC_Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,3,1,1,0,1,3,0,3,3,1,1,1,1,3,3,3,3,4,5,5,6,6};
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
                continue;
            }

            if(nums[start] == nums[end]){
                // Two possible cases
                // Case-1: Not equal to val
                if (nums[start] != val){
                    start++;
                    continue;
                    // We will switch this and end
                } else {
                    // They are equal to val, in that case
                    end--;
                    continue;

                    // we will swtich this with start
                }
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


// Method - 2: Very Better
// int index = 0;
// for(int i=0;i<nums.length;i++) {
//    if(nums[i] != val) {
//        nums[index] = nums[i];
//        index++;
//    }
// }
// return index;