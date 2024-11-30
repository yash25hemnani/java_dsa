package com.strings;

public class LC_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase(); // Convert the String to lower case
        // Instead of removing all alphnumeric characters, we will ignore them

//        while(start <= end){
//            // This way we can ignore any spaces and alphanumeric characters
//            while (start < end && !checkValidity(s.charAt(start))) {
//                start++;
//            }
//            while (start < end && !checkValidity(s.charAt(end))) {
//                end--;
//            }
//
//            if(!(s.charAt(start) == s.charAt(end))){
//                return false;
//            }
//
//            start++;
//            end--;
//
//        }

        // This is O(n*n), so instead we use StringBuilder
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(checkValidity(s.charAt(i))){
                builder.append(s.charAt(i));
            }
        }

        int start = 0;
        int end = builder.length() - 1;


        while(start <= end){

            if(!(builder.charAt(start) == builder.charAt(end))){
                return false;
            }

            start++;
            end--;

        }

        return true;
    }
    
    static boolean checkValidity(char element){
        // Checks if element is between a and z or between 0 ans 9
        if(((int)(element) >= 'a' && (int)(element) <= 'z') || ((int)(element) >= '0' && (int)(element) <= '9')){
            return true;
        }
        
        return false;
    }
}
