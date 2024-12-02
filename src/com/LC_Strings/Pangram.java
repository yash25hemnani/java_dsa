package com.LC_Strings;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        // My plan is that we will create an array, with 26 spaces.
        // Then we will loop through the sentence, and for every element update the corresponding index in the array with 1 else they are already initialized with zero
        // then we wil loop the array and if 0 is found, return false, else return true
        int[] check = new int[26];


        for (int i = 0; i < sentence.length(); i++) {
            int index = (int)(sentence.charAt(i)) - (int)('a'); // ASCII of a
            check[index] = 1;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == 0){
                return false;
            }
        }
        return true;
    }
}
