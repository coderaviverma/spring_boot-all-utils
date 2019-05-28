package com.example.demo.java.messagingqueue.kafkaTutorial.resources;


import com.example.demo.java.messagingqueue.kafkaTutorial.KafkaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {


    @Autowired
   private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC = "kafka_example";


    @GetMapping("publish/{name}")
    public String post(@PathVariable("name") String msg) {

            kafkaTemplate.send(TOPIC,new KafkaUser(msg,"Noida","Apache Kafka"));

        return "Published Successfully";
    }

}
