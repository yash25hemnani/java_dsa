package com.LC_2DArrays;

import java.util.Arrays;

public class searchMatrixRowColSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};

        System.out.println((searchMatrix(arr, 37)));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        // The matrix is sorted in ascending row wise as well as column wise
        // We need to take the upper and lower bound
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0 ){
            if(matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
