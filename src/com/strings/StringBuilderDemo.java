package com.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Refer to Performance Class for theory
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
    }
}
