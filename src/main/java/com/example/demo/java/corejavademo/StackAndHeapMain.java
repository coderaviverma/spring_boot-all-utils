package com.example.demo.java.corejavademo;

import java.util.ArrayList;
import java.util.List;

public class StackAndHeapMain {

    private Integer val;

    public static void main(String[] args) {



        //pass by reference
        StackAndHeapMain main=new StackAndHeapMain();
        main.val=5;
        m2(main);
        System.out.println(main.val);


        //Pass by value
        Integer i=11;
        m1(i);
        System.out.println(i);//11


        //Pass by reference
        List list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        m3(list);
        System.out.println(list.size());

    }

    private static void m1(Integer i) {

        i++;
        System.out.println("inside "+i);//12

    }

    private static void m2(StackAndHeapMain main){

        main.val=10;

        System.out.println(main.val);
    }


    private static List m3(List main){

        main.add("E");

        System.out.println("inside "+main.size());


        main=new ArrayList();

        return main;
    }
}
