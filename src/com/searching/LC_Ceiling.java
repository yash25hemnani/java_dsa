package com.searching;
public class LC_Ceiling {
    // Find the Ceiling i.e. the smallest number greater than target
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceilingY(arr, 15));
        System.out.println(ceilingK(arr, 4));

    }

    static int ceilingY(int[] arr, int target){
        // My solution for the problem, which involves storing every mid which is greater than our target and returning it
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] >= target) {
                answer = arr[mid];
                end = mid-1;
            } else{
                start = mid+1;
            }
        }

        return answer;
    }

    static int ceilingK(int[] arr, int target){
        // Kunal's Solution, where we only return start. The reason is explained in our notes.
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}
