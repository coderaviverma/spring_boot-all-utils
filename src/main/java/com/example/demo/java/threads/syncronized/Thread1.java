package com.example.demo.java.threads.syncronized;

public class Thread1 extends Thread{

    private Sync sync;
    private String name;

    public Thread1(Sync sync,String name) {
        this.sync = sync;
        this.name = name;
    }

    @Override
    public void run() {

        sync.m1(name);
    }
}
