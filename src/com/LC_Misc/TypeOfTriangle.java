package com.LC_Misc;

public class TypeOfTriangle {
    public static void main(String[] args) {
        int[] nums = {3,4,5};
        System.out.println(triangleType(nums));
    }

    static String triangleType(int[] nums) {
        // This is a very very bad code, learn and fix it quickly.

        // Checking for existence of triangle
        if(!(nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[2] + nums[0] > nums[1])){
            return "none";
        }

        // Checking the number of uniques
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] !=  nums[j]){
                    unique++;
                }
            }
        }

        switch (unique){
            case 0: return "equilateral";
            case 2: return "isosceles";
            case 3: return "scalene";
        }

        return "none";
    }
}
