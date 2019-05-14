package com.example.demo.java.corejavademo.hashmaps;

public class Obj2 {
    public String name="a";

    private int value=12;

    private String address;



    @Override
    public boolean equals(Object obj) {
        Ob1 obj2= (Ob1) obj;
        return name.equals(obj2.name);
    }

    @Override
    public int hashCode() {
        return value;
    }
}
