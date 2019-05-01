package com.example.demo.algo.implementation.stack;

public class StackDemoMain {



    public static void main(String[] args) {
        AviStack stack=new AviStack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);


        stack.pop();


        stack.show();

        System.out.println(stack.size());
    }


}
