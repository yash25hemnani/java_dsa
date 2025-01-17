package com.LC_Arrays;

import java.util.Arrays;

public class BestTimeToSellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    static int maxProfit(int[] prices) {
        int start = 0;
        int end = prices.length - 1;
        int profit = Integer.MIN_VALUE;

        while (start < end){
            if (prices[end] - prices[start] > profit){
                profit = prices[end] - prices[start];
                end--;
            } else {
                start++;
            }
        }
        

        return profit;
    }
}
