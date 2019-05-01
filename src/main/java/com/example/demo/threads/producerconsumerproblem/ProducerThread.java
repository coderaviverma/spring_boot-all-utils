package com.example.demo.threads.producerconsumerproblem;

public class ProducerThread extends Thread {


    DataThread dataThread;

    public ProducerThread(DataThread dataThread) {
        this.dataThread = dataThread;
    }

    @Override
    public void run() {


        try {
            dataThread.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
