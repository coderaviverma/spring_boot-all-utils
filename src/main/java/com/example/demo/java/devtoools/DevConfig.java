package com.example.demo.java.devtoools;


import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


//@Profile("dev")
//@Configuration
public class DevConfig {


    @PostConstruct
    public void postDevConst(){
        System.out.println("Dev Config called");


        System.out.println((char)65);
        System.out.println((char)(65+3)+"1");
    }
}
