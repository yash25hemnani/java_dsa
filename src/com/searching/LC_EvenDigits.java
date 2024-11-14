package com.searching;

import java.util.ArrayList;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class LC_EvenDigits {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    // My Solution 1 - Takes 1ms
    static int findNumbers(int[] arr){

        int count = 0;

        for (int item : arr) {
            if (item < 0){
                item *= -1;
            }

            int even_or_odd = 0;
            while(item > 0){
                even_or_odd++;
                item /= 10;
            }
            if (even_or_odd % 2 == 0){
                count++;
            }
        }

        return count;
    }

    // My Solution 2 - This is slower compared to solution 1
//    static int findNumbers(int[] arr){
//        int count = 0;
//
//        for (int item : arr) {
//            // Or you can convert the number to string and find its value
//            String str = Integer.toString(item);
//            if (str.length() % 2 == 0){
//                count++;
//            }
//        }
//
//        return count;
//    }
}
