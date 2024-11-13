package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,8,9,10);
        multiple(2,3,"Yash", "Hemnani");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        // All the items passed as arguments to this function are stored in an array internally.
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        // The order is important here, as the first two are well assigned name.
        // The variable arguments has to be in the end.
    }
}
