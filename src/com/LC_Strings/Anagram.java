package com.LC_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "aaaa";
        String t = "aaaab";

        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
        int[] s_array = new int[26];
        int[] t_array = new int[26];

        // For every item in given strings, update the respective alphabet based index of the created arrays.
        for (int i = 0; i < s.length(); i++) {
            int index = (int)(s.charAt(i)) - (int)('a');
            s_array[index] += 1;
        }

        System.out.println(Arrays.toString(s_array));

        for (int i = 0; i < t.length(); i++) {
            int index = (int)(t.charAt(i)) - (int)('a');
            t_array[index] += 1;
        }

        System.out.println(Arrays.toString(t_array));

        for (int i = 0; i < 26; i++) {
            if(s_array[i] != t_array[i]){
                return false;
            }
        }

        return true;
    }
}
