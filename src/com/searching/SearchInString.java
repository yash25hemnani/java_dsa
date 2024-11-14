package com.searching;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Yash Hemnani";
        char target = 'i';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // Basic Method
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }

        // Or you can do this as well -
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }

        return false;
    }
}
