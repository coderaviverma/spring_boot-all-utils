package com.example.demo.java.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {

//        Object o=new String[]{"one","two","three"};
//
//
//        {
//            for (String s :
//                    (String[]) o) {
//                System.out.println(s+".");
//            }
//        }

        try {
            System.exit(0);
            System.out.println("try called");

        } catch (ArithmeticException e) {
            System.out.println("Arthemetic exception called");
        } catch (Exception e) {
            System.out.println("exception called");
        } finally {
            System.out.println("Finally called");
        }
    }
}
