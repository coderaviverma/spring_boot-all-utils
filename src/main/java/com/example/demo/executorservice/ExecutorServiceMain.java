package com.example.demo.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {


        ExecutorService newFixedThreadPool= Executors.newFixedThreadPool(4);


        ExecutorService cacheThreadPool=Executors.newCachedThreadPool();

        ExecutorService scheduleThreadPool=Executors.newScheduledThreadPool(1);

        ExecutorService singleThreadExecutor=Executors.newSingleThreadExecutor();



    }
}
