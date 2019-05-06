package com.example.demo;

public class InitBlock {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Initializer block");
    }

    public InitBlock() {
        System.out.println("Constructor block");
    }

    public static void main(String[] args) {

//        new InitBlock();
//        new InitBlock();
//        System.out.println("Main");

    }


}
