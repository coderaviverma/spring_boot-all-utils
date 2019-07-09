package com.example.demo.java.threads.levellocks;

public class LevelLockThreadMain {


    public static void main(String[] args) {

        UtilsLock utilsLock=new UtilsLock();
        UtilsLock utilsLock1=new UtilsLock();
        LockThread thread=new LockThread(utilsLock);
        LockThread thread2=new LockThread(utilsLock1);
//        LockThread thread2=new LockThread(utilsLock);

        //Execute different method
        LockThread2 thread3=new LockThread2(utilsLock1);

        thread.start();
        thread2.start();
        thread3.start();
    }
}
