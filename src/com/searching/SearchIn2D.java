package com.searching;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {26,46,32},
                {73,89,54,2}
        };

        int target = 54;
        int[] ans = search(arr, target); // returns {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
            // We need to specify since the array hasn't been initialized
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

