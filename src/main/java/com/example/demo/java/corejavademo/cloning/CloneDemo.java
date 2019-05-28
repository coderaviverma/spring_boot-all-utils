package com.example.demo.java.corejavademo.cloning;

import java.io.Serializable;
import java.util.RandomAccess;

public class CloneDemo implements Cloneable {




    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
