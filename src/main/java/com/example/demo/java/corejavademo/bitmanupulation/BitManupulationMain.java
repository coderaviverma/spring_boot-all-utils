package com.example.demo.java.corejavademo.bitmanupulation;

public class BitManupulationMain {

    public static void main(String[] args) {

        int x=5;

        int y=1;


        System.out.println(x^y);
        System.out.println(x&y);
        System.out.println(x|y);
        
        

        leftShift();
        rightShift();
    }
    
    public static void leftShift(){
        System.out.println("Left Shift");
        System.out.println(1<<1);
        System.out.println(2<<1);
        System.out.println(3<<1);
        System.out.println(4<<1);
        System.out.println(5<<1);
        System.out.println(6<<1);
        System.out.println(7<<1);
        System.out.println(8<<1);
        System.out.println(9<<1);
        System.out.println(10<<1);

    }  
    
    public static void rightShift(){
        //0000 0000
        //     8421
        System.out.println("Right Shift");
        System.out.println(1>>1);
        System.out.println(2>>1);
        System.out.println(3>>1);
        System.out.println(4>>1);
        System.out.println(5>>1);
        System.out.println(6>>1);
        System.out.println(7>>1);
        System.out.println(8>>1);
        System.out.println(9>>1);
        System.out.println(10>>1);

    }
}
