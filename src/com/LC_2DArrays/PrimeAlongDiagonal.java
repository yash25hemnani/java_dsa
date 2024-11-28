package com.LC_2DArrays;

public class PrimeAlongDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(matrix));
    }

    static boolean checkPrime(int num){
        if(num <= 3){
            return true;
        }

        for(int i = 2; i <= num/2; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }
    static int diagonalPrime(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int max = 0;

        // Sum along the primary diagonal
        int row_start = 0;
        int col_start = 0;

        while(row_start < rows && col_start < cols){
            // increase row and column
            if(checkPrime(matrix[row_start][col_start])){
                if(matrix[row_start][col_start] > max){
                    max = matrix[row_start][col_start];
                }
            }

            row_start++;
            col_start++;
        }

        // Sum along secondary diagonal
        row_start = 0;
        col_start = cols - 1;

        while(row_start < rows && col_start >= 0){
            // increase row and column
            if(checkPrime(matrix[row_start][col_start])){
                if(matrix[row_start][col_start] > max){
                    max = matrix[row_start][col_start];
                }
            }

            row_start++;
            col_start--;
        }

        return max;
    }
}
