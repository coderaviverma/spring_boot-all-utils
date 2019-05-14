package com.example.demo.java.threads.executorservice;

import java.util.concurrent.*;

public class Exc1Thread implements Callable<Integer> {

//    @Override
//    public void run() {
//
//
//    }

    LinkedBlockingDeque queue=new LinkedBlockingDeque();
//    queue.

    @Override
    public Integer call() throws Exception {


        if (Thread.interrupted()) {
            throw new Exception();
        }
        return null;
    }
}
