package com.example.demo.java.algo.bitmanupulation;

public class BinaryGap {


    public static void main(String[] args) {


        //this will find the binary gap between the number.




        System.out.println(findBinaryGap(453000));
    }


    private static int findBinaryGap(int N){
        int binaryGap = 0;

        if (N == 0) {
            return 0;
        }

        // remove trailing zeroes if not counted; credit to Peter Taylor
        while (N % 2 == 0) {
            N /= 2;
        }

        for (int j = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                j++;
            } else {
                if (j > binaryGap) {
                    binaryGap = j;
                }

                j = 0;
            }
        }

        return binaryGap;
    }
}
