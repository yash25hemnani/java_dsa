package com.LC_Arrays;

import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] arr = {{2,5},{8,4},{0,-1}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    static int[] findDiagonalOrder(int[][] matrix){
        // We only need to decide weather we are going up or down
        // When going up, row-- and col++
        // When going down, row++ and col--

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] sol = new int[rows * cols];

        // If single element
        if(rows == 1 && cols == 1){
            sol[0] = matrix[rows-1][cols-1];
            return sol;
        }

        // If single row or single column
        if(rows == 1){
            // Add only column values to sol
            for (int i = 0; i < cols; i++) {
                sol[i] = matrix[rows-1][i];
            }

            return sol;
        }

        if(cols == 1){
            // Add only column values to sol
            for (int i = 0; i < rows; i++) {
                sol[i] = matrix[i][cols-1];
            }

            return sol;
        }

        // running till the array is filled
        int row_start = 0;
        int col_start = 0;
        boolean goingUp = true;
        int i = 0;

        while (i < sol.length) {
            if(goingUp){
                sol[i] = matrix[row_start][col_start];
                if((row_start-1 < 0) && (col_start+1 < cols)){
                    col_start++;
                    goingUp = false;
                } else if((row_start - 1 < 0) && (col_start+1 >= cols)){
                    row_start++;
                    goingUp = false;
                } else if ((row_start + 1 < rows) && (col_start + 1 >= cols)) {
                    row_start++;
                    goingUp = false;
                }else {
                    row_start--;
                    col_start++;
                }
                i++;
            }

            if(!goingUp){
                sol[i] = matrix[row_start][col_start];
                if((col_start - 1 < 0) && (row_start + 1 < rows)){
                    row_start++;
                    goingUp = true;
                } else if ((col_start + 1 < cols) && (row_start + 1 >= rows)){
                    col_start++;
                    goingUp = true;
                } else {
                    row_start++;
                    col_start--;
                }

                i++;
            }

        }

        return sol;

    }
}
