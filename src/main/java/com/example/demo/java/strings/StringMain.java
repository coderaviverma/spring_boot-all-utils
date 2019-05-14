package com.example.demo.java.strings;

public class StringMain {



    public static void main(String[] args) {

        String s=new String("avi");

        String s1="avi";



        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s==s1);
        System.out.println(s.equals(s1));


//        String s2=s.intern();
//        System.out.println(s2==s1);

        String s4=new String("Avi");
        s4.concat("Verma");

        System.out.println("s4 "+s4);

        StringBuffer buffer=new StringBuffer("Avi");
        buffer.append("verma");

        System.out.println(buffer);

    }
}
