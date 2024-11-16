package com.searching;

// Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
// Source: Amazon Interview Experience.
// Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
// If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
// Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
// ->if it is greater than high index element then copy high index in low index and double the high index.
// ->if it is smaller, then apply binary search on high and low indices found.

public class PosInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30,31};
        int target = 30;

        System.out.println(binarySearch(arr, target));
    }

    // The idea is to move in chunks of doubles of 2. More details in notebook.
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = 1;
        int chunk = 2;

        while(start <= end){
            int mid = start + (end-start)/2;
            if (target <= arr[end]){
                if (arr[mid] == target){
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                start = end + 1;
                chunk *= 2;
                // Double the chunk, add it to start to get the next segment
                end = start + (chunk-1);

            }
        }

        return -1;
    }
}
