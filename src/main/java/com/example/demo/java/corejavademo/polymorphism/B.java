package com.example.demo.java.corejavademo.polymorphism;

public class B extends A {

    //Compile time Polymorphism
     static void m1(){
        System.out.println("Static method Class B is called");
    }


    //
    public void m2(){
//         this.m2();
//         super.m2();
        System.out.println("normal method Class B is called");
    }


    public void m4(){
        System.out.println("Normal method m4 of Class B is called");

    }

}
