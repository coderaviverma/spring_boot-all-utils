package com.example.demo.threads.intrupted;

public class InteruptDemo {

    public static void main(String[] args) {
        Interupt interupt=new Interupt();
        interupt.start();


        //Interrupt only Thread when it is in sleeping mode, If thread went to sleep after one year, interupt will wait till one year.
        //If thread never when to sleep then interrupt is waste.
        interupt.interrupt();
//        try {
//            interupt.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
