package com.LC_2DArrays;

import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }

    static void spiralOrder(int[][] matrix){
        // First we will print from col = 0 to col = n-1 in row = 0 --> row++
        // Then we will print from row = 0 to row = n-1 for col = 0 --> col--
        // Then we will print from col = n-1 to col = 0 in row = n-1 --> row--
        // Then we will print from row = n-1 to row = 1 for col = 0 --> col++
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row_start = 0;
        int col_start = 0;
        int row_end = rows-1;
        int col_end = cols-1;

        // Work on stopping conditions

        while(row_start <= row_end && col_start <= col_end){
            // Printing first row
            for(int i = col_start; i<=col_end; i++){
                System.out.println(matrix[row_start][i] + " ");
            }
            row_start++;

            // Printing last column
            for(int i = row_start; i<=row_end; i++){
                System.out.println(matrix[i][col_end] + " ");
            }
            col_end--;

            // Printing last row (only if there's a remaining row)
            if (row_start <= row_end) {
                for (int i = col_end; i >= col_start; i--) {
                    System.out.println(matrix[row_end][i] + " ");
                }
                row_end--;
            }

            // Printing first column (only if there's a remaining column)
            if (col_start <= col_end) {
                for (int i = row_end; i >= row_start; i--) {
                    System.out.println(matrix[i][col_start] + " ");
                }
                col_start++;
            }
        }
    }
}
