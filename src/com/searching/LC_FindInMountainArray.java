package com.searching;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class LC_FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,3,2,1};
        int target = 3;

        System.out.println(findItem(arr, target));
    }

    // My solution is to find the peak index and then searching ascendingly in the left array and descendingly in the right array
    static int findItem(int[] arr, int target){
        // Here we find the peak of the array

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start)/2;

            if (arr[mid+1] > arr[mid]){
                // you are in ascending array
                start = mid + 1;
            } else {
                // you are in descending array
                end = mid - 1;
            }

        }

        // peak index is equal to start or end
        int peak = start;

        // Search in ascending array
        int pos1 = orderAgnosticSearch(arr, target, 0, peak);

        if (pos1 != -1){
            // Will always be smaller if there are two occurances so return pos1
            return pos1;
        } else {
            // if pos1 doesn't give an answer, only then we check the descending array.
            // If the element will not be in array, -1 will be returned ultimately
            int pos2 = orderAgnosticSearch(arr, target, peak+1, arr.length-1);
            return pos2;
        }

    }

    // We can also write an order agnostic Binary Search
    static int orderAgnosticSearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        if (isAsc){
            // Ascending Search
            while(start <= end){
                int mid = start + (end-start)/2;

                if(arr[mid] == target){
                    return mid;
                } else if (arr[mid] > target){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        } else {
            // Descending Search
            while(start <= end){
                int mid = start + (end-start)/2;

                if(arr[mid] == target){
                    return mid;
                } else if (arr[mid] > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

//    static int searchAsc(int[] arr, int target, int start, int end){
//        while(start <= end){
//            int mid = start + (end-start)/2;
//
//            if(arr[mid] == target){
//                return mid;
//            } else if (arr[mid] > target){
//                end = mid-1;
//            } else {
//                start = mid+1;
//            }
//        }
//
//        return -1;
//    }
//
//    // Search in Descending Array
//    static int searchDesc(int[] arr, int target, int start, int end){
//        while(start <= end){
//            int mid = start + (end-start)/2;
//
//            if(arr[mid] == target){
//                return mid;
//            } else if (arr[mid] > target){
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        return -1;
//    }

}
