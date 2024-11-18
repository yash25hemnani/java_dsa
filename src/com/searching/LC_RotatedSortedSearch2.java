package com.searching;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class LC_RotatedSortedSearch2 {
    public static void main(String[] args) {
        int[] arr = {2,5,5,6,6,6,0,0,1,2};
        int target = 3;

        int pivot = findPivot(arr);
        System.out.println(pivot);

        if (pivot == -1){
            // This means that array is not rotated, so do normal BinarySearch
            System.out.println(binarySearch(arr, target, 0, arr.length-1));
        }

        // If target is found on pivot
        if(arr[pivot] == target){
            System.out.println(pivot);
        }

        // If target is greater than start
        if(target > arr[0]){
            System.out.println(binarySearch(arr, target, 0, pivot-1));
        }

        // If target is smaller than start
        if(target < arr[0]){
            System.out.println(binarySearch(arr, target, pivot+1, arr.length-1));
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
                // mid < end checks if the element is not the last element
            }

            if (mid>start && arr[mid] < arr[mid-1]){
                // mid > start checks if the element is not the first element
                return mid-1;
            }

            if (arr[mid] > start){
                start = mid + 1;
            }

            if(arr[mid] < start){
                end = mid-1;
            }

        }

        return -1;
    }
}
