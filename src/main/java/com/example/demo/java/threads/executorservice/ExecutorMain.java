package com.example.demo.java.threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class ExecutorMain {

    public static void main(String[] args) {


        int core= Runtime.getRuntime().availableProcessors();

        ExecutorService service= Executors.newFixedThreadPool(core);

        service.submit(new Exc1Thread());
    }


    class MyRejectionHandler extends RejectedExecutionException{

    }
}
