package com.example.demo.java.acuator;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

//@Component
public class CustomActuator  implements HealthIndicator {
    @Override
    public Health health() {


        return null;
    }
}
