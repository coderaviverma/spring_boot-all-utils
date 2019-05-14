package com.example.demo.java.algo.implementation.stack;

public class AviStack {


    private int[] stack = new int[5];
  private int top = 0;

    /**
     * To Add
     */
    public void push(int data) {
        stack[top] = data;
        top++;
    }


    int data;

    /**
     * To delete
     */
    public int pop() {
        if (top!=0){
            top--;

            data = stack[top];
            stack[top]=0;
        }

        return data;
    }

    /**
     * To find
     */
    public int peek() {

        int data=stack[top-1];

        return data;

    }


    public void show() {
        for (int s : stack) {
            System.out.println(" " + s);
        }
    }

    public int size(){
        return top;
    }

}
