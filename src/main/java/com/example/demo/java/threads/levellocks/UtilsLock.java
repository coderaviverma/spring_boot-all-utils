package com.example.demo.java.threads.levellocks;

public  class UtilsLock {


    public synchronized void objectLevelLockMethod() {

        for (int i = 0; i < 10; i++) {

            System.out.println("---------------Class Level Lock Method*** " + i + " " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread.yield();


        }
    }

    public static synchronized void classLevelLockMethod() {
        System.out.println("---------------classLevelLockMethod------------------");

        for (int i = 0; i < 10; i++) {

            System.out.println("--------------Class level Lock Method  " + i + " " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void currentobjectLevelLockBlock() {
        System.out.println("##########currentobjectLevelLockBlock------------------");

        synchronized (this){
            for (int i = 0; i < 10; i++) {

                System.out.println("##########currentobjectLevelLockBlock number " + i + " " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }


    public void classLevelLockBlock() {
        System.out.println("##########classLevelLockBlock------------------");

        synchronized (UtilsLock.class){
            for (int i = 0; i < 10; i++) {

                System.out.println("##########classLevelLockBlock number " + i + " " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public void normalMethod() {
        System.out.println("$$$$$$$$$normalMethod------------------");
            for (int i = 0; i < 10; i++) {

                System.out.println("$$$$$$$$$normalMethod number " + i + " " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

    }




}
