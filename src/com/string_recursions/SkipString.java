package com.string_recursions;

public class SkipString {
    public static void main(String[] args) {
        argMethod("", "abcappleejg");
        System.out.println(bodyMethod("abcdappleghjik"));
        System.out.println(skipAppNotApple("appabcdappleghjik"));
    }

    static void argMethod(String ans, String original){
        if (original.isEmpty()){
            System.out.println(ans);
            return;
        }

        if (original.startsWith("apple")){
            argMethod(ans, original.substring(5));
        } else {
            argMethod(ans + original.charAt(0), original.substring(1));
        }
    }

    static String bodyMethod(String original){
        if (original.isEmpty()){
            return "";
        }

        if (original.startsWith("apple")){
            return bodyMethod(original.substring(5));
        } else {
            return original.charAt(0) + bodyMethod(original.substring(1));
        }
    }

    static String skipAppNotApple(String original){
        if (original.isEmpty()){
            return "";
        }

        if (original.startsWith("app") && !original.startsWith("apple")){
            return skipAppNotApple(original.substring(3));
        } else {
            return original.charAt(0) + skipAppNotApple(original.substring(1));
        }
    }
}
