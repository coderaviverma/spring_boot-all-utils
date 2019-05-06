package com.example.demo.designPattern;

public class DoubleCheckSingleton {

    private static DoubleCheckSingleton INSTANCE=null;

    private static Object lock;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance(){

        //DOUBLE CHECKING LOCK START
        if (INSTANCE==null){

            synchronized (lock){

                if (INSTANCE==null){

                    INSTANCE=new DoubleCheckSingleton();
                }

            }

        }

        //DOUBLE CHECKING LOCK END

        return INSTANCE;
    }
}
