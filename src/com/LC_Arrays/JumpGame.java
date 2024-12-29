package com.LC_Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums ={1,2,0,1};
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums){
        // You are initially positioned at the array's first index, and each
        // element in the array represents your maximum jump length at that
        // position.
        if (nums.length == 1){
            return true;
        }

        int position = 0;

        while(position < nums.length){
            int maxJump = nums[position];

            if (position == nums.length-1) {
                return true;
            }

            if (maxJump == 0){
                return false;
            }

            // Let us try adding the maxJump to the postion and see the cases
            // There is one example - [2,5,0,0] --> True
            // What we can do is, if there is a number greater than maxJump in the range of position to position+maxJump
            // we jump at that number instead.
            int loop_to = Math.min(position + maxJump, nums.length - 1);
            
            for (int i = position; i <= loop_to; i++) {
                if (nums[i] > maxJump){
                    maxJump = nums[i];
                }
            }

            if (position + maxJump > nums.length - 1){
                // The max jump describes the max jumps it can take, if it is 4
                // you can take 1,2,3,4 jumps but not more than that
                int reduced_jump = (nums.length-1) - position;
                position+=reduced_jump;
                continue;
            }

            // If position + maxJump < nums.length add the max jump
            position += maxJump;
        }

        return false;
    }
}
