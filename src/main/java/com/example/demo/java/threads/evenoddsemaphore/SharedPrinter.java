package com.example.demo.java.threads.evenoddsemaphore;

import java.util.concurrent.Semaphore;

public class SharedPrinter {


    Semaphore evenSem = new Semaphore(0);
    Semaphore oddSem = new Semaphore(1);


    private SharedPrinter printer;

    public SharedPrinter(SharedPrinter printer) {

        if (printer==null){
            this.printer = printer;

        }
    }

    void printEven(int num) {

        try {
            evenSem.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        System.out.println("Even Number" + num);
        oddSem.release();
    }

    void printOdd(int num) {

        try {
            oddSem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Odd Number" + num);

        evenSem.release();
    }


}
