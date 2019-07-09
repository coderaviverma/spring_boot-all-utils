package com.example.demo.java.algo.strings;

public class StringPatterns {

    public static void main(String[] args) {

        System.out.println(stringToInteger("1"));
    }

   static int stringToInteger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += Math.pow(10, i) * s.charAt(s.length() - i - 1);
        }
        return result;
    }
}
