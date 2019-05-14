package com.example.demo.java.qualifiers;


import org.springframework.stereotype.Component;

@Component
//@Primary
public class FootbalGame implements Game {
    @Override
    public void start() {
        System.out.println("Football started");
    }

    public void goal() {
        System.out.println("Football goal......");
    }

}
