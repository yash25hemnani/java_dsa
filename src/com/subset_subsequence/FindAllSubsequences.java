package com.subset_subsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllSubsequences {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeqArrayList("", "abc"));
    }

    static void subSeq(String p, String up) {
        // p - processed
        // up - unprocessed

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqArrayList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);
        ArrayList<String> left = subSeqArrayList(p+ch, up.substring(1));
        ArrayList<String> right = subSeqArrayList(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
