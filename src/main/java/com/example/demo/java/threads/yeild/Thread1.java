package com.example.demo.java.threads.yeild;

public class Thread1 extends Thread {


    @Override
    public void run() {

        System.out.println("ThreadA is running");
        for(int index=0;index<5;index++)
        {
            System.out.println("ThreadA running on ["+index+"]");
            if(index==2){
                System.out.println("ThreadA calls Thread.yield() ");
                Thread.yield();
            }
        }
        System.out.println("ThreadA completed");

    }
}
