package com.example.demo.java.corejavademo.hashmaps;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMain {

    public static void main(String[] args) {

        ConcurrentHashMap hashMap=new ConcurrentHashMap();
        hashMap.put(101,"A");
        hashMap.put(102,"B");
        hashMap.putIfAbsent(101,"D");//Won't be added
        hashMap.putIfAbsent(103,"C");
        hashMap.remove(101,"D");//


    }
}
