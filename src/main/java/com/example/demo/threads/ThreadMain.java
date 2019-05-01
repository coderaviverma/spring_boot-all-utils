package com.example.demo.threads;

public class ThreadMain {

    public static void main(String[] args) {


        CreateThread1 thread1 = new CreateThread1();
//        Thread thread=new Thread(thread1);
//        thread.start();
        thread1.run();

        System.out.println("Main thread ---- >>" + Thread.currentThread());





    }
}
