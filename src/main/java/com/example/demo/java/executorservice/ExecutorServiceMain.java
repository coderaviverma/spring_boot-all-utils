package com.example.demo.java.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);


        ExecutorService cacheThreadPool = Executors.newCachedThreadPool();

        ExecutorService scheduleThreadPool = Executors.newScheduledThreadPool(1);

        scheduleThreadPool.submit(new ExecutorCallable());



        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();


        Future task = newFixedThreadPool.submit(new ExecutorRunner());

        try {
            System.out.println("Executed this");
            System.out.println("Runnable with exe"+task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Future taskCallable = newFixedThreadPool.submit(new ExecutorCallable());

        System.out.println("Callable with exe "+taskCallable.get());


    }
}
