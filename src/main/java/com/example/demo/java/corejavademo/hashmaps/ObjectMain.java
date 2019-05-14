package com.example.demo.java.corejavademo.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class ObjectMain {

    public static void main(String[] args) {


        Ob1 ob1=new Ob1();

        Obj2 obj2=new Obj2();

        System.out.println(ob1.equals(obj2));

        Map hashMap=new HashMap();
        hashMap.put(ob1,"123");
        hashMap.put(obj2,"123");


        System.out.println(hashMap.size());
    }
}
