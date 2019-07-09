package com.example.demo.java.threads.itc;

public class ThreadA extends Thread{


    Object object;

    public ThreadA(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        synchronized (object){
            System.out.println("Thread started....");
            try {
                object.wait(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread executed....");

        }

    }
}
