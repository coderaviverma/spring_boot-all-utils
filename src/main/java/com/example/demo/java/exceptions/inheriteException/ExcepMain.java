package com.example.demo.java.exceptions.inheriteException;

import java.io.FileNotFoundException;

public class ExcepMain {

    public static void main(String[] args) {


        ChildException childException=new ChildException();

        try {
            childException.exceptionTest();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
