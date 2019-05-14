package com.example.demo.java.threads.producerconsumerproblem;

import java.util.LinkedList;

public class  DataThread {

    LinkedList<Integer> linkedList = new LinkedList();
    int capacity = 2;

    public void produce() throws InterruptedException {

        int value = 0;
        while (true) {

            synchronized (this) {

                while (capacity == linkedList.size()) {
                    wait();
                }


                System.out.println("Producer produced-----------"
                        + value);
                // to insert the jobs in the list
                linkedList.add(value++);

                notify();

//Make programming easy to understand
                Thread.sleep(1000);
            }
        }

    }


    public void consumer() throws InterruptedException {

        while (true) {
            synchronized (this) {

                while (linkedList.size() == 0) {
                    wait();
                }

                int val = linkedList.removeFirst();

                System.out.println("Consumer consumed-" + val);

                notify();

                Thread.sleep(1000);


            }

        }

    }

}
