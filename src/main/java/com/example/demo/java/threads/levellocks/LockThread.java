package com.example.demo.java.threads.levellocks;

public class LockThread extends Thread {

    UtilsLock utilsLock;

    public LockThread(UtilsLock utilsLock) {
        this.utilsLock = utilsLock;
    }

    @Override
    public void run() {
//
//        utilsLock.printNumber();
//
        utilsLock.classLevelLockMethod();


        //Block Lock
//        utilsLock.currentobjectLevelLockBlock();

//        utilsLock.classLevelLockBlock();

//        utilsLock.normalMethod();

    }
}
