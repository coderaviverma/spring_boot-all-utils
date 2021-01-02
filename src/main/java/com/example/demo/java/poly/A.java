package com.example.demo.java.poly;

import java.io.IOException;

public class A {

     void callme()throws IOException {
        System.out.println("A method");
    }

    static void callme1()throws IOException {
        System.out.println("A method");
    }
}


 class D extends A{



     void callme(){


     }

 }