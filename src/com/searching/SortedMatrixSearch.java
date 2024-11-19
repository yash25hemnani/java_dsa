//package com.searching;
//
//public class SortedMatrixSearch {
//    public static void main(String[] args) {
//
//    }
//
//    static int[] binarySearch(int[][] matrix, int row_to_search, int col_start, int col_end, int target){
//        // We need to specify which row to search and from which column to which column and also what to search
//        while(col_start < col_end){
//            int mid = col_start + (col_end-col_start)/2;
//
//            if (matrix[row_to_search][mid] == target){
//                return new int[] {row_to_search, mid};
//            } else if (matrix[row_to_search][mid] > target) {
//                col_end = mid - 1;
//            } else {
//                col_start = mid + 1;
//            }
//        }
//
//        return new int[] {-1,-1};
//    }
//
//    static int[] search(int[][] matrix, int target){
//        int rows = matrix.length;
//        int cols = matrix[0].length; // be cautious over here
//
//        if (rows == 1){
//            return binarySearch(matrix, 0, 0, cols-1, target);
//        }
//
//        int row_start = 0;
//        int row_end = rows-1;
//        int col_mid = cols/2;
//
//        // Run the loop till 2 rows are remaining
//        while(row_start < (row_end-1)){
//            int mid = row_start + (row_end - row_start)/2;
//
//
//
//        }
//    }
//}
