package com.example.demo.java.threads.levellocks;

public class LockThread2 extends Thread {

    UtilsLock utilsLock;

    public LockThread2(UtilsLock utilsLock) {
        this.utilsLock = utilsLock;
    }

    @Override
    public void run() {
//
//        utilsLock.objectLevelLockMethod();
//
//        utilsLock.classLevelLockMethod();


        //Block Lock
//        utilsLock.currentobjectLevelLockBlock();

        utilsLock.classLevelLockBlock();

//        utilsLock.normalMethod();

    }
}
