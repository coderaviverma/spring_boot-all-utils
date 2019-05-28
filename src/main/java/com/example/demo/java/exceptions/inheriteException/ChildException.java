package com.example.demo.java.exceptions.inheriteException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildException extends ParentException {

    @Override
    public void exceptionTest() throws FileNotFoundException {
//        super.exceptionTest();

        System.out.println("Child Exception");


//        throw new FileNotFoundException();
    }
}
