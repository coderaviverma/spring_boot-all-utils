package com.example.demo.threads.printevenodd;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenThread extends Thread {

    AtomicInteger integer;
    Object lock;

    public EvenThread(AtomicInteger integer, Object lock) {
        this.integer = integer;
        this.lock = lock;
    }

    @Override
    public void run() {

      synchronized (lock){


          while (integer.get()<20){

              if (integer.get()%2!=0){
                  try {
                      lock.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

              }else {

                  System.out.println("Even Number "+integer.get());

                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  integer.incrementAndGet();
                lock.notifyAll();

              }


          }

      }

    }
}
