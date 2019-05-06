package com.example.demo.corejavademo.polymorphism;

public class PolyMain {


    public static void main(String[] args) {


        A a=new B();

        //Compile Time Polymorphism
        a.m1();

        //Run time Polymorphism (Overriding at runtime)
        a.m2();


        B b=new B();
        b.m1();


    }
}
