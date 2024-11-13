package com.functions;

public class MethodOverloading {
    public static void main(String[] args) {
        fun("Yash");
        fun(251198);
        fun(1,2,3);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int num){
        System.out.println(num);
    }

    static void fun(int a, int b, int c){
        System.out.println(a + " " + b + " " + c);
    }
}
