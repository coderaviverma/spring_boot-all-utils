package com.example.demo.java.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class FixedScheduler {


//    @Scheduled(cron = "0 30 * * * *")
//    public void fixedSchedular() {
//        System.out.println("Cron running " + new Date());
//    }
//
//    @Scheduled(fixedDelay = 5000)
//    public void fixedSchedular1() {
//        System.out.println("fixedSchedular1 running " + new Date());
//    }

    private static final Logger log = LoggerFactory.getLogger(FixedScheduler.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
