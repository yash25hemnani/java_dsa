package com.LC_Misc;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trappingRainWater(height));
    }

    static int trappingRainWater(int[] height){
        int len = height.length;
         // Finding the maximum heights from the right

        int[] maxRight = new int[len];
        maxRight[len-1] = 0; // At the right most element, no water can be stored.
        for (int i = len-2; i >=0 ; i--) {
            maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
        }

        // Finding the maximum hegiths from the left
        int[] maxLeft = new int[len];
        maxLeft[0] = 0;
        for (int i = 1; i < len; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }

        // Finding the water to be stored
        int water = 0;
        for (int i = 0; i < len; i++) {
            int minHeight = Math.min(maxLeft[i], maxRight[i]);

            if (minHeight > height[i]){
                water+=(minHeight-height[i]);
            }
        }

        return water;
    }
}
