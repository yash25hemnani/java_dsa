package com.searching;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,7,11};

        System.out.println(findKthPositive(arr, 5));
    }

    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
    static int findKthPositive(int[] arr, int k) {
        int temp = 0;
        int firstElement = 1;

        while(temp!=k){
            if(binarySearch(arr, firstElement)){
                // If found, check for next element
                firstElement++;

            } else {
                temp++;
                firstElement++;
            }
        }
        return firstElement-1;
    }
}
