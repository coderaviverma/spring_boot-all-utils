package com.example.demo.java.threads;

public class ThreadExtend extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {

                System.out.println("Current Thread Started: "
                        + Thread.currentThread().getName());
//                Thread.sleep(5000);
                synchronized (this){
                    wait(5000);
                }

                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
//            System.out.println(i);
        }
    }
}
