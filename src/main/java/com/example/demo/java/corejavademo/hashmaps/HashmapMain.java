package com.example.demo.java.corejavademo.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashmapMain {


    public static void main(String[] args) {


        Map<Integer,String> map=new HashMap<>();
        System.out.println(map.put(1,"shashi"));
        System.out.println(map.putIfAbsent(2,"shashi"));


    }
}
