package com.strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch);
            series = series + ch; // In each iteration, a new object is being created, since Strings are immutable and then series point to it.
            // a, ab, abc, ..... abcdefghijklmnopqrstuvwxy --> These 25 strings will have no reference variable
            // TC = O(n*n) // Since sum of elements like this 1+2+3....N = N(N+1)/2
        }

        System.out.println(series);

        // So what is the solution to this? We can append to the same object! The datatype that can do this is called StringBuilder
        // The reference variable won't change and the same object will be edited.

    }
}
