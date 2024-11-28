package com.LC_2DArrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }

    static int diagonalSum(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int sum = 0;

        // Sum along the primary diagonal
        int row_start = 0;
        int col_start = 0;

        while(row_start < rows && col_start < cols){
            // increase row and column
            sum += matrix[row_start][col_start];
            row_start++;
            col_start++;
        }

        // Sum along secondary diagonal
        row_start = 0;
        col_start = cols - 1;

        while(row_start < rows && col_start >= 0){
            if(!(row_start == col_start)){
                // increase row and decrease column
                sum += matrix[row_start][col_start];
            }

            row_start++;
            col_start--;
        }

        return sum;
    }
}
