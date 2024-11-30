package com.strings;

public class Palindrome {
    public static void main(String[] args) {
        String pal = "abcdcbab";
        int start = 0;
        int end = pal.length()-1;
        boolean palindrome = true;

        while(start <= end){
            if(pal.charAt(start) == pal.charAt(end)){
                start++;
                end--;
            } else {
                palindrome = false;
                break;
            }
        }

        if(palindrome){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
