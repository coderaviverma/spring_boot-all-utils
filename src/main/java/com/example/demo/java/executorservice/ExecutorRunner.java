package com.example.demo.java.executorservice;

public class ExecutorRunner implements Runnable {
    @Override
    public void run() {


        System.out.println("Executor Runnining....");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
