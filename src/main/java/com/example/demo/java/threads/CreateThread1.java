package com.example.demo.java.threads;

public class CreateThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Created Thread 1 is running ---->>>> " + Thread.currentThread());

        for (int i = 0; i < 2; i++)
        {
            try
            {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            }

            catch(Exception ex)
            {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
            System.out.println(i);
        }
    }
}
