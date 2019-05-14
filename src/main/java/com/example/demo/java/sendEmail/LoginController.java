package com.example.demo.java.sendEmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

@Autowired
    private MailService mailService;

    @RequestMapping("/signup")
    public String signUp() {
        System.out.println(""+Thread.currentThread());

        try{
            mailService.sendEmail(new MailPayload());
            mailService.sendEmail(new MailPayload());
            mailService.sendEmail(new MailPayload());
            mailService.sendEmail(new MailPayload());

        }catch (Exception e){
            e.printStackTrace();
        }

        return "Email Send";
    }



}
