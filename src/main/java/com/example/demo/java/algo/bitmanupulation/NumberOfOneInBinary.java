package com.example.demo.java.algo.bitmanupulation;

public class NumberOfOneInBinary {


    public static void main(String[] args) {


        System.out.println(findOne(3));
    }


    public static int findOne(int x){
        int sum=0;

        while (x>0){
            System.out.println("XOR"+(x^1));
            sum+=x^1;
            x>>=1;
        }

        return sum;
    }
}
