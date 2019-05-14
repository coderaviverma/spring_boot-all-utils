package com.example.demo.java.algo.array;

public class FindMedianOfMergeTwoSortedArray {


    public static void main(String[] args) {

        int[] a = {1, 5, 7, 8, 9, 11,12};
        int[] b = {2, 3, 4, 6, 13, 15,16};


        if (a.length==b.length){
            System.out.println(   mergeTwoList(a,b,a.length));
        }

    }

    private static int mergeTwoList(int[] a1, int[] a2, int size) {

        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;


        for (count = 0; count <= size; count++) {


            if (i == size) {
                m1 = m2;
                m2 = a2[0];
                break;
            } else if (j == size) {

                m1 = m2;
                m2 = a1[0];
                break;
            }


            if (a1[i] < a2[j]) {
                m1 = m2;
                m2 = a1[i];
                i++;
            } else {
                m1 = m2;
                m2 = a2[j];
                j++;
            }

        }
        return (m1 + m2) / 2;

    }
}
