package com.example.demo.threads.waitnotify;

public class Thread2Notify extends Thread {

    int total=0;

    @Override
    public void run() {

        synchronized (this){
            for (int i = 0; i <= 100; i++) {

                total=total+i;
            }

            this.notify();

        }

    }
}
