package com.example.demo.java.threads.yeild;

public class ThreadYeildMain {
    public static void main(String[] args) {


        System.out.println("main thread is started");
        Thread1 threadA = new Thread1();
        threadA.start();

        Thread2 threadB = new Thread2();
        threadB.start();
        threadB.setPriority(1);

        System.out.println("main thread completed");
    }
}
