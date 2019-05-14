package com.example.demo.java.jmsdemo.activemqstandalone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/activemq/standalone")
public class Producer {





    @GetMapping("/{mes}")
    public String publishMessage(@PathVariable("mes")final String msg){

        return "";
    }
}
