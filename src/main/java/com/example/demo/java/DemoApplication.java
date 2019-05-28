package com.example.demo.java;

import com.example.demo.java.devtoools.DevConfig;
import com.example.demo.java.qualifiers.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@ComponentScan("com.example.demo.java.messagingqueue.kafkaTutorial")
@SpringBootApplication
//@EnableScheduling
@EnableAsync
public class DemoApplication {


//    @Autowired
//    private  DevConfig mailService;



//    @Autowired
//    @Qualifier(value = "race")
//    private Game game;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }


    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct called");
//        mailService.signUp();

//        game.start();

//        ((Race)game).goal();
    }


    @PreDestroy
    private void preDestroy() {
        System.out.println("PreDestroy called");
//        mailService.signUp();

    }



}

