package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,77,77,8};
        System.out.println(linearSearch(arr, 77, 0));
        System.out.println(findIndex(arr, 77, 0));
        System.out.println(findIndexLast(arr, 77, arr.length-1));
        findAllIndex(arr, 77, 0);
        System.out.println(list);
        ArrayList<Integer> answer = findAllIndex(arr, 77, 0, new ArrayList<>());
        System.out.println(answer);
    }

    static boolean linearSearch(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || linearSearch(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return findIndex(arr, target, index+1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return findIndex(arr, target, index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length-1){
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr, target, index+1);
    }

    // Returning the ArrayList instead of creating one on the outside
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findIndexArgumentList(int[] arr, int target, int index){
        // We will be not be passing the list in the argument but in the body
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        // Will contain answer for that function call
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> answerFromBelowCalls =  findIndexArgumentList(arr, target, index+1);

        // Add the current and the answerFromBelowCalls list together and return
        list.addAll(answerFromBelowCalls);

        return list;
    }
}
