package com.LC_Strings;

import java.util.ArrayList;

public class GoatLatin {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    static String toGoatLatin(String sentence) {
        // Let me first split by spaces
        ArrayList<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (i == sentence.length() - 1){
                builder.append(sentence.charAt(i));
                list.add(builder.toString());
            }

            if (sentence.charAt(i) == ' '){
                list.add(builder.toString());
                builder = new StringBuilder();
            } else {
                builder.append(sentence.charAt(i));
            }
        }

        for (String item : list) {
            int index = list.indexOf(item);
            char first = item.charAt(0);
            builder = new StringBuilder();
            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
                item = item + "ma";
            } else {
                item = item.substring(1) + item.charAt(0) + "ma";
            }

            list.set(index, item);
        }

        for (String item : list) {
            int index = list.indexOf(item);
            
            for (int i = 0; i <= list.indexOf(item); i++) {
                item = item + "a";
            }

            list.set(index, item);
        }

        builder = new StringBuilder();
        for (String item : list) {
            builder.append(item);
            builder.append(" ");
        }

        return builder.substring(0, builder.length()-1);
    }
}
