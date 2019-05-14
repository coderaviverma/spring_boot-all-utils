package com.example.demo.java.createObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DifferentWaysToCreateObject {


    public static void main(String[] args) {

//        Way 1
        CreateObjectDemo objectDemo=new CreateObjectDemo();


//        Way 2

        try {
            CreateObjectDemo objectDemo1= (CreateObjectDemo) Class.forName("com.example.demo.java.createObject.CreateObjectDemo").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        try {
            Constructor<?> constructor=CreateObjectDemo.class.getConstructor();

            CreateObjectDemo objectDemo1= (CreateObjectDemo) constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
