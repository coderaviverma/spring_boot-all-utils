package com.example.demo.java.designPattern.creational;

import java.io.Serializable;

public class LazySingleton implements Cloneable, Serializable {
    private static LazySingleton lazySingleton;

    private LazySingleton(){
        //Stop creating object from Reflection API as reflection calls default constructor
      if (lazySingleton!=null){
          throw new IllegalStateException("Object can't be created using reflection");
      }
    }


    public static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }

        return lazySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Stop clone method from clonning
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        //this method is called during serialization process
        return lazySingleton;
    }

}
