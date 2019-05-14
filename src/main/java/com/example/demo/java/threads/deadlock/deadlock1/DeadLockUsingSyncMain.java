package com.example.demo.java.threads.deadlock.deadlock1;

public class DeadLockUsingSyncMain {

    public static void main(String[] args) {

        Thread t1= new Thread(() -> {

            synchronized (String.class) {

                System.out.println("String Lock aquired by thread 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Object.class){
                    System.out.println("Object Lock aquired by thread 1");


                }

            }
            });

        Thread t2= new Thread(() -> {

            synchronized (Object.class) {
                System.out.println("Object Lock aquired by thread 2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (String.class){

                    System.out.println("String Lock aquired by thread 2");

                }

            }
        });


        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();


    }
}
