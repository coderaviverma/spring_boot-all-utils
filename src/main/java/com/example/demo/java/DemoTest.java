package com.example.demo.java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DemoTest {
        private String  naml;
    public static void main(String[] args) {
        //        String a1="hello";

        String a2="hello";
        String a5=new String("hello");
        StringBuilder a3=new StringBuilder("hello");
        StringBuffer a4=new StringBuffer("hello");

        List list=new ArrayList();

//        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

//        addData(list);
        System.out.println(list.size());


        TreeSet set=new TreeSet();

        set.add(a2);
//        set.add(a3);
//        set.add(a4);
        set.add(a5);


//        System.out.println(set.size());



        int value =20;

        passByValue(value);

        System.out.println(value);




        PassByReference pass=new PassByReference();

        pass.setValue(10);

        passByReference(pass);

        System.out.println(pass.getValue());



    }

    private static void passByValue(int value){
        value=30;
    }

    private static void passByReference(PassByReference va){
        va.setValue(40);
    }
    private static void addData(List ls){

        ls.add("hello");
        ls.add("hello");

        ls.get(0);

        ls=new ArrayList();
    }
}
