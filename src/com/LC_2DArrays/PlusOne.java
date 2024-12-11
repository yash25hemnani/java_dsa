package com.LC_2DArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        int carry = 0;
        // Logic is that we will add to the last element, take carry and move towards the start

        ArrayList<Integer> sol = new ArrayList<>(digits.length);

        int last_element = digits[last] + 1;
        int append = 0;

        if(last_element >= 10){
            append = last_element % 10;
            carry = last_element/10;
            sol.add(0, append);
        } else {
            sol.add(0, last_element);
        }

        for (int i = last - 1; i >= 0 ; i--) {
            int value = digits[i];
            if (carry != 0){
                value += carry;
                carry = 0;
            }

            if(value >= 10){
                append = value%10;
                carry = value/10;
                sol.add(0, append);
            } else {
                sol.add(0, value);
            }
        }

        if (carry != 0){
            sol.add(0, carry);
            carry = 0;
        }

        int[] ans = new int[sol.size()];

        for (int i = 0; i < sol.size(); i++) {
            ans[i] = sol.get(i);
        }

        return ans;
    }
}
