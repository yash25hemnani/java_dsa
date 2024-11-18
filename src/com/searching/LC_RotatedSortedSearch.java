package com.searching;

public class LC_RotatedSortedSearch {
    public static void main(String[] args) {
        int[] normalArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(peakIndex(normalArray));

        // Rotated sorted arrays
        int[] rotatedArray = {8,9,2,3,4}; // Rotated at index 5
        System.out.println(peakIndex(rotatedArray));

        // For the searching
        int target = 0;
        System.out.println(searchRotated(rotatedArray, target));

    }

    static int peakIndex(int[] arr){
        // This is for roated array and not mountain array
        // intuition - let's try to find peak

        // Need first and last becasue start and end will keep changing
        int first = 0;
        int last = arr.length - 1;

        //
        int start = 0;
        int end = arr.length - 1;

        // For a sorted array, last will always be larger than first
        if (arr[last] > arr[first]){
            return last;
        }


        while(start <= end){
            // Check the first and last element and decide which way to move
            // if mid is smaller than end, move to your left
            // if mid is larger than start, move to your right
            // check the element right after mid, to make sure mid is the peak or not
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[last]){
                end = mid-1;
            } else if (arr[mid] >= arr[first] && arr[mid+1] > arr[mid]) {
                // >= because the mid can come on first index too in case of two elements in array
                start = mid + 1;
            } else {
                return mid; // the peak will be achieved at this point
            }

        }

        return -1;
    }

    static int searchRotated(int[] arr, int target){
        // If array has only 1 item
        if (arr.length == 1){
            if (arr[0] == target){
                return 0;
            } else {
                return -1;
            }
        }

        // Calculating peak later b/c in single element array, peak would not work
        int peak = peakIndex(arr);

        int start = 0;
        int end = arr.length-1;

        // First, we will see if the peak element and target are same
        if (arr[peak] == target){
            return peak;
        }

        // Second we will see if it belongs in array on either side of peak
        // For left
        if (target >= arr[start] && target < arr[peak]){
            end = peak - 1;
        } else {
            // It will be on the right side
            start = peak + 1;
        }

        // Apply Binary Search
        while(start <= end){
            int mid = start + (end-start)/2;

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
