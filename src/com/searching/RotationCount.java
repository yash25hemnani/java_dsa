package com.searching;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println("Roation Count is " + (peakIndex(arr) + 1));

        // The output will always be peak index + 1.
        // This is true for duplicates as well as non-duplicates
    }

    // For non duplicates
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            } else if (arr[mid] > arr[0]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
