package com.LC_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        int len = lengthOfLastWordPointer("   sdada");
        System.out.println(len);
    }

    static int lengthOfLastWord(String s){
        s = s.trim();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1){
                builder.append(s.charAt(i));
                list.add(builder.toString());
            }

            if (s.charAt(i) == ' '){
                list.add(builder.toString());
                builder = new StringBuilder();
            } else {
                builder.append(s.charAt(i));
            }
        }

        String item = list.get(list.size()-1);
        return item.length();
    }

    static int lengthOfLastWordPointer(String s){
        s = s.trim();
        int len = 0;
        int end = s.length()-1;

        if (end == 0 && s.charAt(end) != ' '){
            return 1;
        }

        while(true){
            if (end < 0){
                return len;
            }
            if (s.charAt(end) == ' '){
                break;
            } else {
                end--;
                len++;
            }
        }

        return len;
    }
}
