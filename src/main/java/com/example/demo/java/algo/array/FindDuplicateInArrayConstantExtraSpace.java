package com.example.demo.java.algo.array;

public class FindDuplicateInArrayConstantExtraSpace {


    public static void main(String[] args) {


        int arr[]={1,2,3,1,3,6,6};

//        printDuplicates(arr,arr.length);
        printRepeating(arr,arr.length);


    }


   static void printDuplicates(int[] arr,int size){

       int i;

       for ( i = 0; i < size; i++) {


            if (arr[Math.abs(arr[i])]>=0){

                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            }else {
                System.out.println("print "+Math.abs(arr[i]));
            }

        }

    }


    static void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }
}
