package com.example.demo.java.threads.yeild;

public class Thread2 extends Thread {


    @Override
    public void run() {
        System.out.println("ThreadB is running");
        for(int index=0;index<5;index++){
            System.out.println("ThreadB running on ["+index+"]");
        }
        System.out.println("ThreadB completed");


    }
}
