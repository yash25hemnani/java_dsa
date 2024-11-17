package com.searching;

// https://leetcode.com/problems/find-peak-element/description/
// Here, there can be multiple peak values, we can return either of them

public class FindPeakElement {
    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 1, 3, 5, 6, 4};
//        System.out.println(findPeakElement(arr1));
//        int[] arr2 = {6,5,4,3,2,3,2};
//        System.out.println(findPeakElement(arr2));
//        int[] arr3 = {1};
//        System.out.println(findPeakElement(arr3));
//        int[] arr4 = {1,2};
//        System.out.println(findPeakElement(arr4));
//        int[] arr5 = {2,1};
//        System.out.println(findPeakElement(arr5));
        int[] arr6 = {1, 2, 3};
        System.out.println(findPeakElement(arr6));
    }


    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        // Here, instead of comparing only arr[mid] with arr[mid+1] we compare with arr[mid-1] as well
        // So if arr[mid-1] < arr[mid] > arr[mid+1] --> Peak
        while(start <= end){
            int mid = start + (end-start)/2;
            // What if mid came at start or end? You won't be able to do mid-1 or mid+1

            if (mid == 0 || (mid == arr.length - 1)){
                // Check for array of lenght two as well
                if (arr.length == 2){
                    if (arr[0] > arr[1]){
                        return 0;
                    } else {
                        return 1;
                    }
                }
                return mid;
            }

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            } else if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            } else if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
        }

        return 0;
    }
}
