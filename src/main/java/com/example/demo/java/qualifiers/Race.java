package com.example.demo.java.qualifiers;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Race implements Game {
    @Override
    public void start() {
        System.out.println("Race Started ");
    }
}
