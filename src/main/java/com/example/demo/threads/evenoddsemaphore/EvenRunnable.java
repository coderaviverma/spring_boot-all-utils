package com.example.demo.threads.evenoddsemaphore;

public class EvenRunnable implements Runnable {

        private SharedPrinter printer;

        private int max;

    public EvenRunnable(SharedPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    @Override
    public void run() {

        for (int i = 2; i <=max ; i=i+2) {
            printer.printEven(i);
        }

    }
}
