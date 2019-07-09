package com.example.demo.java;

import java.util.Scanner;

public class ScannerDemoMain {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

//        int i =4;
//        double d =4.0;
//        String s ="Avinash";
//
//        int j = scan.nextInt();
        double k = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();
//
//        System.out.println(i+j);
//        System.out.println(d+k);
//        System.out.println(s+inputString);

        System.out.println(inputString);
    }
}
