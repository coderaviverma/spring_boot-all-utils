package com.example.demo.restcontrollers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    @GetMapping("/test")
    private String getMyName() {
        return "Test API Called";
    }


    private static synchronized  String nothing(){
        return "";
    }
}
