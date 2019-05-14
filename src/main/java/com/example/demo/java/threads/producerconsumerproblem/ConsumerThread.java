package com.example.demo.java.threads.producerconsumerproblem;

public class ConsumerThread extends Thread{



    DataThread dataThread;

    public ConsumerThread(DataThread dataThread) {
        this.dataThread = dataThread;
    }

    @Override
    public void run() {

        try {
            dataThread.consumer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
