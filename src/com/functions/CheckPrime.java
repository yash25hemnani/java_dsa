package com.functions;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        System.out.println(checkPrimeEfficiently(num));
    }

    static boolean checkPrimeEfficiently(int n){
        if (n <= 1){
            return false;
        }

        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }

        return true;
    }

    /*
    To check if a number n is prime, we only need to check divisors up to the square root of n. This is because if n has a divisor larger than its square root, the corresponding smaller divisor will have already been checked.

    For example:

    For n = 36, the square root is 6. The divisors are pairs like (2, 18), (3, 12), (4, 9), and (6, 6). By checking divisors up to 6, we find all pairs.
    If we find a divisor greater than the square root (like 10), its pair (the smaller divisor) would have already been checked.
     */
}
