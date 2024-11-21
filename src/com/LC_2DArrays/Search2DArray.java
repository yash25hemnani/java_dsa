package com.LC_2DArrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//        int[][] arr = {{1},{3}};
        System.out.println(arr.length);
        int target = 34;

        System.out.println(searchMatrix(arr, target));

    }

    static boolean binarySearch(int[][] matrix, int row_to_search, int col_start, int col_end, int target){

        while(col_start <= col_end){
            int mid = col_start + (col_end-col_start)/2;
            if(target == matrix[row_to_search][mid]){
                return true;
            } else if (target > matrix[row_to_search][mid]){
                col_start = mid + 1;
            } else {
                col_end = mid - 1;
            }
        }

        return false;
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check for single row
        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int row_start = 0;
        int row_end = rows - 1;
        int col_mid = (cols-1)/2;

        // Run loop till only two rows are remaining
        while(row_start < (row_end-1)){
            // Check the middle element
            int row_mid = row_start + (row_end-row_start)/2;

            if(target == matrix[row_mid][col_mid]){
                return true;
            } else if (target > matrix[row_mid][col_mid]){
                row_start = row_mid; // We need to include this row as well
            } else {
                row_end = row_mid;
            }
        }

        // Check middle elements of the two rows for the item
        if(target == matrix[row_start][col_mid]){
            return true;
        }

        if(target == matrix[row_start+1][col_mid]){
            return true;
        }

        // Check the remaining four subparts
        if(col_mid > 0 && target <= matrix[row_start][col_mid-1]){ // Checking if single element using col_mid > 0
            return binarySearch(matrix, row_start, 0, col_mid-1, target);

        } else if(col_mid < cols-1  && target >= matrix[row_start][col_mid+1] && target <= matrix[row_start][cols-1]){ // Checking if the item is in bound
            return binarySearch(matrix, row_start, col_mid+1, cols-1, target);

        } else if(col_mid > 0  && target <= matrix[row_start+1][col_mid-1]){
            return binarySearch(matrix, row_start+1, 0, col_mid-1, target);

        } else if (col_mid < cols-1 && target >= matrix[row_start+1][col_mid+1] && target <= matrix[row_start+1][cols-1]){
            //target >= matrix[row_start+1][col_mid+1]
            return binarySearch(matrix, row_start+1, col_mid+1, cols-1, target);
        }
        return false;
    }
}
