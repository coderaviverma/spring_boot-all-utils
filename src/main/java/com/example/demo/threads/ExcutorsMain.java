package com.example.demo.threads;

public class ExcutorsMain {


    public static void main(String[] args) {

//
//        CreateThread1 thread1=new CreateThread1();
//
//        Thread t=new Thread(thread1);
//        t.start();


        ThreadExtend t1=new ThreadExtend();
        ThreadExtend t2=new ThreadExtend();
        ThreadExtend t3=new ThreadExtend();



        t1.start();

        // starts second thread after when
        // first thread t1 has died.
        try
        {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t1.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }


        // t2 starts
        t2.start();

        // starts t3 after when thread t2 has died.
        try
        {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t2.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }

        t3.start();
    }
}
