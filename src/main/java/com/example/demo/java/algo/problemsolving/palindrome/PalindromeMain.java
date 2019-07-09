package com.example.demo.java.algo.problemsolving.palindrome;

public class PalindromeMain {


    public static void main(String[] args) {


        System.out.println(checkPalidnrome(122));

    }


    private static boolean checkPalidnrome(int x) {

        if (x < 0) {
            return false;
        }


        int res = 0;

        int y = x;

        while (y != 0) {

            res = res * 10 + y % 10;
            y /= 10;
        }

        return res == x;
    }
}
