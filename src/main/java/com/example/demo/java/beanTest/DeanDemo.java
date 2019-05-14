package com.example.demo.java.beanTest;

import org.springframework.context.annotation.Bean;

//@Configuration
public class DeanDemo {

    @Bean
    public INLoveWith demo(){
        return new INLoveWith("I love Java");
    }



}
