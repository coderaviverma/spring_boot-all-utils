package com.example.demo.java.corejavademo;


import java.util.BitSet;
import java.util.Set;

public class BitTest {

    public static void main(String[] args) {


        BitSet b1=new BitSet();
        b1.set(0,true);
        b1.set(1,true);
        b1.set(2,true);
        b1.set(3,false);
        b1.set(4,true);

        BitSet b2=new BitSet();
        b2.set(0,true);
        b2.set(1,false);
        b2.set(2,true);
        b2.set(3,false);
        b2.set(4,true);

        b1.and(b2);

        System.out.println(b1);


//        BitArray array

    }
}
