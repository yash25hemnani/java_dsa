package com.LC_Misc;

public class StoneRemovalGame {
    public static void main(String[] args) {
        System.out.println(canAliceWin(20));
    }

    static boolean canAliceWin(int n){
        if (n < 10){
            return false;
            // Since Alice can't remove 10, she loses
        }

        n -= 10;
        int turn = 2;

        while(n >= 0){
            int toRemove = 10 - (turn - 1);

            if (toRemove > n && turn%2 == 0){
                return true;
            } else if (toRemove > n && turn%2 != 0) {
                return false;
            } else {
                n -= toRemove;
                turn++;
            }
        }

        return false;
    }
}
