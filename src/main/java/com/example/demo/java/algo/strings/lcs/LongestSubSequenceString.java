package com.example.demo.java.algo.strings.lcs;


public class LongestSubSequenceString {
    //Amazon Interview Question

    public static void main(String[] args) {

        String s="AGGTAB";
        String s1="GXTXAB";


        System.out.println(lcs(s.toCharArray(),s1.toCharArray(),s.length(),s1.length()));

    }


    private static int lcs(char[] x,char[] y, int m,int n){


        int[][] L=new int[m+1][n+1];


        int i,j;

        for (i=0;i<=m;i++){

            for (j=0;j<=n;j++){

                if (i==0 || j==0){
                    L[i][j]=0;
                }else if (x[i-1]==y[j-1]){
                    L[i][j]=L[i-1][j-1]+1;
                }else {
                    L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
                }
            }

        }

        return L[m][n];
    }



}
