package com.searching;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int target = 6;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] binarySearch(int[][] matrix, int row_to_search, int col_start, int col_end, int target){
        // We need to specify which row to search and from which column to which column and also what to search
        while(col_start <= col_end){
            int mid = col_start + (col_end-col_start)/2;

            if (matrix[row_to_search][mid] == target){
                return new int[] {row_to_search, mid};
            } else if (matrix[row_to_search][mid] > target) {
                col_end = mid - 1;
            } else {
                col_start = mid + 1;
            }
        }

        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious over here

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int row_start = 0;
        int row_end = rows-1;
        int col_mid = cols/2;

        // Run the loop till 2 rows are remaining
        while(row_start < (row_end-1)){
            // row_end-1 means second last row. So basically when row_start is equal to second last row
            // the loop breaks.
            int mid = row_start + (row_end - row_start)/2;
            
            if(matrix[mid][col_mid] == target){
                return new int[]{mid, col_mid};
            } else if (matrix[mid][col_mid] < target) {
                // Ignore the above two rows as they will be smaller than the target
                row_start = mid;
            } else {
                // matrix[mid][col_mid] > target
                // Ignore the below two rows as they will be greater than the target
                row_end = mid;
            }

        }

        // Now we have two rows
        // check weather the target in col of two rows
        if(matrix[row_start][col_mid] == target){
            return new int[]{row_start, col_mid};
        }
        // using row_start + 1 because row_end will be equalt to row_start at time of loop breaking
        if(matrix[row_start + 1][col_mid] == target){
            return new int[]{row_start + 1, col_mid};
        }

        // search in 1st half
        // Use this if(target < matrix[row_start][col_mid]) or
        if(target <= matrix[row_start][col_mid-1]){
            return binarySearch(matrix, row_start, 0, col_mid-1, target);
        }

        // search in 2nd half
        if(target >= matrix[row_start][col_mid+1] && target <= matrix[row_start][cols-1]){ // Checking if the target lies in bounds
            return binarySearch(matrix, row_start, col_mid+1, cols-1, target);
        }

        // search in 3rd half
        if(target <= matrix[row_start+1][col_mid-1]){
            return binarySearch(matrix, row_start+1, 0, col_mid-1, target);
        }

        // search in 4th half
        if(target >= matrix[row_start+1][col_mid-1] && target <= matrix[row_start+1][cols-1]){
            return binarySearch(matrix, row_start+1, col_mid+1, cols-1, target);
        }

        return new int[]{-1,-1};

    }
}
