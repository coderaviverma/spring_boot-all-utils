package com.example.demo.java.executorservice.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchMain {

    public static void main(String[] args) {


        ExecutorService executorService= Executors.newFixedThreadPool(4);
        CountDownLatch latch=new CountDownLatch(3);
        executorService.submit(new DependencyWork(latch));
        executorService.submit(new DependencyWork(latch));
        executorService.submit(new DependencyWork(latch));

        System.out.println("latch waiting ");

        try {
            //It will wait till all thread don't count the countdown method
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executed ");


    }


    public static class DependencyWork implements Runnable{

        private CountDownLatch countDownLatch;

        public DependencyWork(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {

            System.out.println("Thread waiting ");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//Doing some work
            countDownLatch.countDown();


            System.out.println("Thread other work ");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread other work Completed ");


            //other work done by thread
        }
    }
}
