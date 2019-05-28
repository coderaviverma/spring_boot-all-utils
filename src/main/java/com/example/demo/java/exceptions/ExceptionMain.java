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
/*
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

        */

        try{
            System.out.println("Try run");

            getData();
            System.out.println("Try run end");

        }catch (Exception e){
            System.out.println("Catch run"+e.getMessage());
            return;
        }finally {
            System.out.println("finally run");
        }



    }


    public static int getData(){
        int a=1/0;

        return 1;
    }
}
