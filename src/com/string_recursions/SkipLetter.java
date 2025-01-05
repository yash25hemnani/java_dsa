package com.string_recursions;

public class SkipLetter {
    public static void main(String[] args) {
        argMethod("", "ababcbacbabac");
        String ans = bodyMethod("ababcbacbabac");
        System.out.println(ans);
    }

    static void argMethod(String ans, String original){
        if (original.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = original.charAt(0);
        if (ch == 'a'){
            argMethod(ans, original.substring(1));
        } else {
            argMethod(ans + ch, original.substring(1));
        }
    }

    static String bodyMethod(String original){
        if (original.isEmpty()){
            return "";
        }

        if (original.charAt(0) == 'a'){
            return bodyMethod(original.substring(1));
        } else {
            return original.charAt(0) + bodyMethod(original.substring(1));
        }
    }
}
