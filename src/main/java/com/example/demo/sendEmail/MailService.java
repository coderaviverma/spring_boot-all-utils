package com.example.demo.sendEmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private JavaMailSender javaMailSender;


    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    @Async
    public void sendEmail(MailPayload payload) throws MailException ,InterruptedException{

        System.out.println("" + Thread.currentThread());
        Thread.sleep(10000);

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("4011d21e98-0e8451@inbox.mailtrap.io");
        mailMessage.setTo("coderaviverma@gmail.com");
        mailMessage.setSubject("I Love you");
        mailMessage.setText("I Really Really Love you my dear!");

        System.out.println("" + Thread.currentThread());

        javaMailSender.send(mailMessage);
    }
}
