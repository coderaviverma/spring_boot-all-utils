package com.example.demo.java.threads.printevenodd;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddMain {

    public static void main(String[] args) {

        AtomicInteger integer=new AtomicInteger(1);
        Object lock =new Object();

        EvenThread thread=new EvenThread(integer,lock);

        OddThread oddThread=new OddThread(integer,lock);

        thread.start();
        oddThread.start();

    }


}
