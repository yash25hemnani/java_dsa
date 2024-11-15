package com.searching;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class LC_CeilingLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
        target = 'z';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int N = letters.length;
        
        while (start <= end){
            int mid = start + (end-start)/2;
            
            if (Integer.valueOf(letters[mid]) > Integer.valueOf(target)) {
                end = mid - 1;
            } else {
                // In case of equal, it will go towards the larger letters
                start = mid + 1;
            }
        }

        return letters[start % N];
    }

}
