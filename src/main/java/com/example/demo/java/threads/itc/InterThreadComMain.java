package com.example.demo.java.threads.itc;

public class InterThreadComMain {

    public static void main(String[] args) {


        Object o = new Object();
        Thread thread1 = new ThreadA(o);

        thread1.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Sleep complete....");

        synchronized (o) {
            o.notify();
        }

        System.out.println("Thread notify....");

    }


}
