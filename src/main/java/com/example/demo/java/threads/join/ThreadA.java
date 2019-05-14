package com.example.demo.java.threads.join;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {


        //This is main thread


        ThreadB b=new ThreadB();
        b.start();
        b.join();
        System.out.println(b.total);

    }
}
