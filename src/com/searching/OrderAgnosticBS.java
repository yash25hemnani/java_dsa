package com.searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};

        System.out.println(binarySearch(arr1, 8));
        System.out.println(binarySearch(arr2, 8));
    }

    // Return index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


}
