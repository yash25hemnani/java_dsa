package com.recursion;

public class PatternPrinting {
    public static void main(String[] args) {
        triangle1(4, 0);
        triangle2(3, 0);
    }

    static void triangle1(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("*");
            triangle1(row, col+1);
        } else {
            System.out.println();
            triangle1(row-1, 0);
        }
    }

    static void triangle2(int row, int col){
        // If we swtich the positons of the funtion calls, we get a different triangle.
        if (row == 0){
            return;
        }
        if (col < row){
            triangle2(row, col+1);
            System.out.print("*");
        } else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}
