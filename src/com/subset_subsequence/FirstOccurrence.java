package com.subset_subsequence;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(strStr("butad", "sad"));
    }

    static int strStr(String haystack, String needle) {
        if (haystack.isEmpty()){
            return -1;
        }

        if (haystack.startsWith(needle)){
            return 0;
        } else {
            if (strStr(haystack.substring(1), needle) == -1){
                return -1;
            } else {
                return 1 + strStr(haystack.substring(1), needle);
            }
        }


    }
}