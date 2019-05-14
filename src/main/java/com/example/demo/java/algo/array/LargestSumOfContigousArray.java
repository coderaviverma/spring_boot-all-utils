package com.example.demo.java.algo.array;

public class LargestSumOfContigousArray {


    public static void main(String[] args) {
        

        //By using Kadane's Algorithm

        int[] a={1,-4,2,5,-3,1,-5,1,3};


        System.out.println( sumOfLargestContigiousArray(a));
    }

  private static int sumOfLargestContigiousArray(int[] a){

        int max_so_far=0,max_ending_here=0;

        for (int i = 0; i < a.length; i++) {

         max_ending_here=max_ending_here+a[i];

         if (max_ending_here<0){
             max_ending_here=0;
         }
         if (max_so_far<max_ending_here){
             max_so_far=max_ending_here;
         }

        }


        return max_so_far;
    }
}
