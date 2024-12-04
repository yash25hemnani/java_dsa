package com.LC_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s){
        // Removing the trailing and following spaces
        s = s.trim();
        // Use a String Array and Add the words
        StringBuilder word = new StringBuilder();
        ArrayList<String> word_array = new ArrayList<>(10);
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) != ' ' && (i != s.length() - 1)){
                word.append(s.charAt(i));
            } else {
                if(i == s.length() - 1){
                    word.append(s.charAt(i));
                }
                if (!word.toString().equals("")){
                    word_array.add(word.toString());
                    word = new StringBuilder();
                }
            }
            i++;
        }

        System.out.println(Arrays.toString(word_array.toArray()));

        StringBuilder sol = new StringBuilder();
        for (int j = word_array.toArray().length - 1; j >= 0; j--) {
            sol.append(word_array.get(j));
            if (j != 0){
                sol.append(" ");
            }
        }

        return sol.toString();
    }
}
