package com.example.demo.threads.syncronized;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class SyncDemoMain {


    public static void main(String[] args) {


        //Condition 1 - Single Instance o
        Sync sync=new Sync();

        Thread1 thread1=new Thread1(sync,"Dhoni");
        Thread1 thread2=new Thread1(sync,"Yuvi");
        Thread1 thread3=new Thread1(sync,"Sachin");

        thread1.start();
        thread2.start();
        thread3.start();

//        CompletableFuture.supplyAsync().thenApply()
    }
}
