package com.example.demo.threads.producerconsumerproblem;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class UsingThreadMain {

    public static void main(String[] args) throws InterruptedException {


        System.exit(1);


        DataThread dataThread=new DataThread();

        ProducerThread producerThread=new ProducerThread(dataThread);

        ConsumerThread consumerThread=new ConsumerThread(dataThread);

        producerThread.start();

        consumerThread.start();


//
//        producerThread.join();
//
//        consumerThread.join();
    }
}
