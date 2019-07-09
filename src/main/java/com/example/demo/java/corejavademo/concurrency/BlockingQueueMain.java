package com.example.demo.java.corejavademo.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueMain {


    public static void main(String[] args) {


        BlockingQueue blockingQueue=new ArrayBlockingQueue(2);

        try {
            blockingQueue.put("A");
            blockingQueue.put(2);
            blockingQueue.put(3);
            blockingQueue.put(4);
            blockingQueue.put(5);
            blockingQueue.put(6);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       blockingQueue.stream().map(x->x+"").forEach(System.out::print);
    }
}
