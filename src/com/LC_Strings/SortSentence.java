package com.LC_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SortSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("sentence3 is2 This1"));
    }

    static String sortSentence(String s) {
        // sentence4 a3 is2 This1
        // Logic - Create an Array of Strings and assign the words to correct index
        // Call to string method

        int number_of_words = 1; // As the number will be spaces + 1
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                number_of_words++;
            }
        }

        String[] word_array = new String[number_of_words];
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' && (i != s.length()-1)){ // We need to append and run for last element as well, it has no further spaces so else won't run otherwise
                word.append(s.charAt(i));
            } else {
                if (i == s.length()-1) {
                    word.append(s.charAt(i));
                }
                int index = (int)(word.charAt(word.length() - 1)) - (int)('1');
                word.deleteCharAt(word.length() - 1);
                word_array[index] = word.toString();
                word = new StringBuilder();
            }
        }

        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < word_array.length; i++) {
            sentence.append(word_array[i]);
            if(i != (word_array.length - 1)){
                sentence.append(" ");
            }
        }

        return sentence.toString();
    }
}
