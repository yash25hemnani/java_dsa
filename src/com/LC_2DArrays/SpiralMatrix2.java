package com.LC_2DArrays;
//https://leetcode.com/problems/spiral-matrix-ii/

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] output = generateMatrix(n);

        for (int row = 0; row < output.length; row++) {
            for (int col = 0; col < output[0].length; col++) {
                System.out.print(output[row][col] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateMatrix(int n){

        int[][] matrix = new int[n][n];

        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = n-1;
        int temp = 1;

        while(row_start <= row_end && col_start <= col_end){
            // Start from col = col_start to col = col_end in row = row_start --> row_start++
            // Start from row = row_start to row = row_end in col = col_end --> col_end--
            // Start from col = col_end to col = col_start in row = row_end --> row_end--
            // Start from row = row_end to row = row_start in col = col_start --> col_start++

            for(int i = col_start; i<=col_end; i++){
                matrix[row_start][i] = temp;
                temp++;
            }
            row_start++;

            for(int i = row_start; i<=row_end; i++){
                matrix[i][col_end] = temp;
                temp++;
            }
            col_end--;

            if(row_start <= row_end){
                for(int i = col_end; i>=col_start; i--){
                    matrix[row_end][i] = temp;
                    temp++;
                }
                row_end--;
            }

            if(col_start <= col_end){
                for(int i = row_end; i>=row_start; i--){
                    matrix[i][col_start] = temp;
                    temp++;
                }
                col_start++;
            }
        }

        return matrix;
    }
}
