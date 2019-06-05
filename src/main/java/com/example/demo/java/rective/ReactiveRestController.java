package com.example.demo.java.rective;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactiveRestController {


    //Flux and Mono


    @GetMapping(name = "name",produces = "s")
    public String getName(){
        return "This should be connected to database using reactive JDBC driver";
    }
}
