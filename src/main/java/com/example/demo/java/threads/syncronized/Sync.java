package com.example.demo.java.threads.syncronized;

public class Sync {

    synchronized void m1(String name) {

        for (int i = 0; i < 10; i++) {

            System.out.println("Execute Started m1" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    Object object = new Object();

    synchronized void m2() {
        System.out.println("Execute Started m2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    void m3(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Execute Started m3" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
