package com.subset_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutationIteration {
    public static void main(String[] args) {
        permutation(new int[]{1,2,3});
    }

    static void permutation(int[] nums){

        List<List<Integer>> permutations = new ArrayList<>();
        permutations.add(new ArrayList<>());

        for (int num: nums){
            List<List<Integer>> newPermutations = new ArrayList<>();
            for (List<Integer> perm:permutations) {
                for (int i = 0; i <= perm.size(); i++) {
                    List<Integer> newPerm = new ArrayList<>(perm);
                    newPerm.add(i, num);
                    newPermutations.add(newPerm);
                }
            }

            permutations = newPermutations;
        }

        System.out.println(Arrays.toString(permutations.toArray()));
    }
}
