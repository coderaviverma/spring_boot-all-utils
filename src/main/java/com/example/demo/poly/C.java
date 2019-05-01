package com.example.demo.poly;

public class C {

    public static void main(String[] args) {
        A c = new B();
        ((B) c).m2();
        c.callme();
    }
}
