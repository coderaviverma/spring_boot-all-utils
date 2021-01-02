package com.example.demo.java.poly;

import java.io.IOException;

public class B extends A {

    @Override
   public void callme() throws NullPointerException{
        System.out.println("B method");
    }

    protected void m2(){
        System.out.println("m2");
    }

    public static void main(String[] args) {
    }

    static void callme1()throws IOException {
        System.out.println("B method");
    }
}
