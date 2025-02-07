package com.subset_subsequence;

import java.util.ArrayList;

public class Permutaions {
    public static void main(String[] args) {
        System.out.println(permutationArrayList("", "abc"));
        System.out.println(permutationsCount("", "abc"));
    }

    static void permutaions(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutaions(f + ch + s, up.substring(i));
        }
    }

    static ArrayList<String> permutationArrayList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutationArrayList(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    static int permutationsCount(String p, String up){
        if (up.isEmpty()){
            // Whenever, up gets empty, we have found one answer
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
