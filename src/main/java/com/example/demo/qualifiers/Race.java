package com.example.demo.qualifiers;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class Race implements Game {
    @Override
    public void start() {
        System.out.println("Race Started ");
    }
}
