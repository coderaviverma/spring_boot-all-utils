package com.example.demo.java.bitwise;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public class BitwiseMain {

    public static void main(String[] args) {


        int x=123456789; //1111

        int y=1; //1000

//        System.out.println(x>>>y);

        int i = 13;
        short s = 13;
        byte b = 13;
        System.out.println("i: " + String.format("%32s",
                Integer.toBinaryString(i)).replaceAll(" ", "0"));
        System.out.println("s: " + String.format("%16s",
                Integer.toBinaryString(0xFFFF & s)).replaceAll(" ", "0"));
        System.out.println("b: " + String.format("%8s",
                Integer.toBinaryString(0xFFFFFF & b)).replaceAll(" ", "0"));


        printBinaryNumbers(x);
    }



    public static void printBinaryNumbers(int n) {
        char[] arr = Integer.toBinaryString(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character c : arr) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
