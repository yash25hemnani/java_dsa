package com.string_recursions;

public class FirstOccurance {
    public static void main(String[] args) {
        System.out.println(strStr("bigboobs", "pen"));
    }

    static int strStr(String haystack, String needle) {
        if (haystack.isEmpty()){
            return -1;
        }

        if (haystack.startsWith(needle)){
            return 0;
        } else {
            return 1 + strStr(haystack.substring(1), needle);
        }
    }
}
