package com.LC_Strings;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("usa"));
    }

    static boolean detectCapitalUse(String word) {
        boolean all_upper = true;
        boolean all_lower = true;
        boolean capitalized = true;

        // Checking for all upper case
        for (int i = 0; i < word.length(); i++) {
            if(!((int)word.charAt(i) >= (int)('A') && (int)word.charAt(i) <= (int)('Z'))){
                all_upper = false;
                break;
            }
        }

        if (all_upper){
            return true;
        }

        // Checking for all lower case
        for (int i = 0; i < word.length(); i++) {
            if(!((int)word.charAt(i) >= (int)('a') && (int)word.charAt(i) <= (int)('z'))){
                all_lower = false;
                break;
            }
        }

        if (all_lower){
            return true;
        }

        // Checking if capitalized
        if(!((int)word.charAt(0) >= (int)('A') && (int)word.charAt(0) <= (int)('Z'))){
            capitalized = false;
        }

        for (int i = 1; i < word.length(); i++) {
            if(!((int)word.charAt(i) >= (int)('a') && (int)word.charAt(i) <= (int)('z'))){
                capitalized = false;
                break;
            }
        }

        if (capitalized){
            return true;
        }

        return false;
    }
}
