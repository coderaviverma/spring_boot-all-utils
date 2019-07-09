package com.example.demo.java.algo.matrix;

public class MatrixSearch {


    public static void main(String[] args) {


        int[][] a={{0,1,2,3},
                {5,6,7,8},
                {9,10,11,12},
                {14,15,16,17}};


        System.out.println(contains(a,12));
    }

    /**
     * Complexity O(m+n)
     * @param a
     * @param x
     * @return
     */
    public static  boolean contains(int a[][],int x){

        if (a.length==0 && a[0].length==0)return false;

        int row=0;
        int col=a.length-1;

        while (row<a[0].length && col>=0){
            if (a[row][col]==x)return true;

            if (a[row][col]<x) {
                row++;
            }else {
                col--;
            }

        }

        return false;
    }
}
