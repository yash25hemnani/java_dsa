package com.searching;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,3,2};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        // Loop breaks when (start = end) as at that point, they'll be on the peak index
        while(start < end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]){
                // You are in descending array so move left
                // The mid you are on right now maybe the peak too, so to consider it, instead of end = mid - 1, end will be mid only
                end = mid;
            } else if (arr[mid] < arr[mid+1]) {
                // You are in the ascending array, so move right
                // The next element is already larger, so we will start the segment from it.
                start = mid + 1;
            }
        }
        // In the end, start == end and pointing to the largest number because
        // start and end are trying to find the max element. So when only one element is remaining,
        // we know it is the max number.

        return start; // return end;
    }
}
