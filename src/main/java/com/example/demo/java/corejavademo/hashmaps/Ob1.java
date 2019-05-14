package com.example.demo.java.corejavademo.hashmaps;

public class Ob1 {

    public String name="a";

    private int value=12;

    private String address;

    @Override
    public boolean equals(Object obj) {
        Obj2 obj2= (Obj2) obj;
        return name.equals(obj2.name);
    }

    @Override
    public int hashCode() {
        return value;
    }
}
