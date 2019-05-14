package com.example.demo.java.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class MyRestController {



    @RequestMapping(value = "getapi",method = RequestMethod.GET)
    public String getAPI(){


        return "API";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestParam("name") String phone, @RequestParam String password) {
        System.out.printf("Login called " + phone + " password " + password);
        return new ResponseEntity<>("SHASHI", HttpStatus.OK);
    }
}
