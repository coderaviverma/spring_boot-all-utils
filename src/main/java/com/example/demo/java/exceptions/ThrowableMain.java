package com.example.demo.java.exceptions;

import org.apache.tomcat.jni.Error;

public class ThrowableMain {


    public static void main(String[] args) {



        try {

        }catch (Throwable throwable){
            throw new OutOfMemoryError();
        }
    }
}
