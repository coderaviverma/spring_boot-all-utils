package com.example.demo.threads.waitnotify;

public class WaitNotifyDemo {

    public static void main(String[] args) {

        Thread2Notify b = new Thread2Notify();
        b.start();


        //We will get IllegealMonitorStateException
        //Wait Notify and Notify all can be called from Syncronized block only

        synchronized (b){
            try {
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(b.total);

    }
}
