package com.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, 7));
    }

    // Returns index if found or -1 if not found
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find middle element
            // int mid = (start + end)/2; // (Start + End) in case of large numbers may exceed the range of int.

            // So we can do this -
            int mid = start + ((end - start)/2);

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }
}
