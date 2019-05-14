package com.example.demo.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);


       List<Integer> list1= list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println(list1);
    }

}
