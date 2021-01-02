package com.example.demo.java.poly;

import java.io.IOException;

public class C {

    public static void main(String[] args) throws IOException {
        A c = new B();
        ((B) c).m2();
        c.callme();
        ((A) c).callme();
        c.callme();
    }
}
