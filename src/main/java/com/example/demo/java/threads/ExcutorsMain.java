package com.example.demo.java.threads;

public class ExcutorsMain {


    public static void main(String[] args) {

//
//        CreateThread1 thread1=new CreateThread1();
//
//        Thread t=new Thread(thread1);
//        t.start();

//
//        ThreadExtend t1=new ThreadExtend();
//        ThreadExtend t2=new ThreadExtend();
//        ThreadExtend t3=new ThreadExtend();
//
//
//        t1.start();
//        t2.start();
//        t3.start();


        for (int i = 0; i < 100; i++) {

            ThreadExtend t=new ThreadExtend();
            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }





    }
}
