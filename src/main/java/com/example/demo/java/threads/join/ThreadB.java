package com.example.demo.java.threads.join;

public class ThreadB extends Thread {

    int total=0;

    @Override
    public void run() {


        for (int i = 0; i <= 100; i++) {

            total=total+i;
        }


    }
}
