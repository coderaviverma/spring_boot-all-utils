package com.example.demo.java.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/pathcanbenull/{null}", method = RequestMethod.POST)
    public ResponseEntity<?> checkNullInPathVariable(@PathVariable("null") String name){
        System.out.println("pathcanbenull "+name);
        return new ResponseEntity<>("Path can be null "+name, HttpStatus.OK);
    }

    @RequestMapping(value = "/requestparams", method = RequestMethod.POST)
    public ResponseEntity<?> requestParamDemo(@RequestParam("nam") String name){
        System.out.println("requestParamDemo "+name);
        return new ResponseEntity<>("RequestParamDemo "+name, HttpStatus.OK);
    }

    @RequestMapping(value = "user/{id}/users", method = RequestMethod.GET)
    public void getPath(@RequestParam("name") String name, @PathVariable("id") Integer id) {
        System.out.println("name="+name);
        System.out.println("id="+id);
    }

    @RequestMapping(value = "user/requestbodytest", method = RequestMethod.POST)
    public void requestBodyDemo(@RequestParam("name") String name, @RequestBody String name1) {
        System.out.println("name=  "+name);
        System.out.println("id=    "+name1);
    }

}
