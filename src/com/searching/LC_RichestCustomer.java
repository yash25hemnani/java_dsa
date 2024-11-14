package com.searching;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class LC_RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},{7, 1, 3},{1, 9, 5}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }

            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}
