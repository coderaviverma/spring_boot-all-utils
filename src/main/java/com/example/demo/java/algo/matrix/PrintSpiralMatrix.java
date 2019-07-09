package com.example.demo.java.algo.matrix;

public class PrintSpiralMatrix {

    public static void main(String[] args) {

        int R = 3;
        int C = 6;

        int a[][] = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };

        printSpiralMatrix(R,C,a);
    }


    private static void printSpiralMatrix(int m, int n, int a[][]) {

        int i, k = 0, l = 0;

        /*
         * k=starting row index
         * l=starting column index
         * m=ending row index
         * n=ending column index
         * i=iterator
         * */


        while (k < m && l < n) {


            //print the first row from the remaning rows
            for (i = l; i < n; ++i) {
                System.out.println(a[k][i] + "");
            }
            k++;

            //print the last column from the remaning coloumn
            for (i = k; i < m; ++i) {
                System.out.println(a[i][n - 1]);
            }
            n--;


            //print the last row from the remaining row
            if (k < m) {

                for (i = n - 1; i >= 1; --i) {
                    System.out.println(a[m-1][i]+"");
                }

                m--;
            }

            //print the first column from the remaning column
            if (l<n){

                for (i=m-1;i>=k;--i){

                    System.out.println(a[i][l]+"");
                }

            }


        }
    }
}
