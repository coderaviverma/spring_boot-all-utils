package com.example.demo.threads.executorservice;

import com.example.demo.threads.syncronized.Thread1;

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
