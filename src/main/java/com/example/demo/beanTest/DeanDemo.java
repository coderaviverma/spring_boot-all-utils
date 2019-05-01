package com.example.demo.beanTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DeanDemo {

    @Bean
    public INLoveWith demo(){
        return new INLoveWith("I love Java");
    }



}
