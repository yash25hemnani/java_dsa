package com.LC_Strings;

public class ToLower {
    public static void main(String[] args) {
//        System.out.println((int)'a'); 97
//        System.out.println((int)'A'); 65
        System.out.println(toLower("HELLLOW"));
    }

    static String toLower(String s){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= (int)'A' && s.charAt(i) <= (int)'Z'){
                int asciiUpper = s.charAt(i) - (int)'A';
                int asciiLower = (int)'a' + asciiUpper;
                builder.append((char) asciiLower);
            } else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }
}
