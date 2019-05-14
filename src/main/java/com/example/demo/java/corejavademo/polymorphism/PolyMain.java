package com.example.demo.java.corejavademo.polymorphism;

public class PolyMain {


    public static void main(String[] args) {


        A a=new B();

        //Compile Time Polymorphism
//        a.m1();

        //Run time Polymorphism (Overriding at runtime)
//        a.m2();


//        A b=new B();
//        b.m2();
        checkValue(0.0_0f);

//            for ( int i = 0; i < 10; i++) {
//
//                if (i<2){
//                    System.out.println(true + "i");
//                }
//
//            }


        char[] c= new char[]{'a','b','c'};

        String s=new String(c);

        System.out.println(s);

    }


    public static void checkValue(Float name){
        System.out.println(name);
    }
}
