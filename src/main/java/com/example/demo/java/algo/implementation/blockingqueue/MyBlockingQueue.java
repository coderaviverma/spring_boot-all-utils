package com.example.demo.java.algo.implementation.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

    private Queue<E> queue;

    private int size = 16;



    ReentrantLock lock = new ReentrantLock();

    Condition notFull=lock.newCondition();
    Condition notEmpty=lock.newCondition();


    public MyBlockingQueue(int size) {
        this.size = size;
        queue = new LinkedList<>();

    }


    public void put(E e) {

        lock.lock();
        try {
            queue.add(e);
        } finally {
            lock.unlock();
        }
    }

    public E take() {

        lock.lock();
        try{
            E item = queue.remove();

            return item;
        }finally {
            lock.unlock();
        }

    }
}
