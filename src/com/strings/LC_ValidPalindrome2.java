package com.strings;

public class LC_ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "abcdefaghgfedcba";
        System.out.println(isPalindromeAfterDeleting(s));
    }

    static boolean isPalindromeAfterDeleting(String s){
        // s only has lowercase elements

        // My logic is that we can check each element and the one that hinders in being the palindrome can be stored
        // For each hinderance their can be two possible outcomes
        // Suppose we have abcdcbaa
        // a == a, but a != b --> so we check the next element for each, the one who's following element matches, is out answer (this has to be removed, in our case, the seocnd last a)

        int start = 0;
        int end = s.length() - 1;
        char element = ' ';
        boolean atMost = false;

        while(start <= end){
            if(!atMost && (s.charAt(start) != s.charAt(end))){
                // Check if adjacent element to start is our solution
                if(s.charAt(start + 1) == s.charAt(end)){
                    element = s.charAt(start);
                    start++;
                    atMost = true;
                } else if(s.charAt(start) == s.charAt(end - 1)){
                    element = s.charAt(end);
                    end--;
                    atMost = true;
                } else {
                    return false;
                }

            } else if (atMost && (s.charAt(start) != s.charAt(end))) {
                return false;

            } else {
                start++;
                end--;
            }
        }

        System.out.println(element);

        return true;
        
    }
}
