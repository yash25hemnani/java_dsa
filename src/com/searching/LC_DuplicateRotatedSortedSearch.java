package com.searching;

public class LC_DuplicateRotatedSortedSearch {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int pivot = findPivotWithDuplicates(arr);
        System.out.println(pivot);

        int target = 0;

        // In cases like {1,1,1,1} there is no pivot, so pivot is -1
        if (pivot == -1){
            System.out.println(binarySearch(arr, target, 0, arr.length-1));
        } else if (arr[pivot] == target) {
            System.out.println("Found");
        } else if (target > arr[0]){
            System.out.println(binarySearch(arr, target, 0, pivot-1));
        } else {
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
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            // Remove Duplicates from front and last if they are equal to mid
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                // Check if start is a pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }

                // Otherwise
                start++;

                // Check if end is a pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }

                // Otherwise
                end--;
            }
            // Complex Part, revise and revisit
            else if (arr[mid] > arr[start] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                // Explained in notes
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
}
