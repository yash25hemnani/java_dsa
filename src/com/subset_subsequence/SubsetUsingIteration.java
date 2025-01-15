package com.subset_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetUsingIteration {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(subset(new int[]{-2,1,-3,4,-1,2,1,-5,4}).toArray()));
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(outer.get(i));
                newSubset.add(num);
                outer.add(newSubset);
            }
        }

        return outer;
    }
}
