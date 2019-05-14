package com.example.demo.java.threads.deadlock;

public class DeadLockUsingJoinInMain {


    public static void main(String[] args) {


        //Join method will make
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread running");
    }
}
