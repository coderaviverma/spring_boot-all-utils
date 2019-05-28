package com.example.demo.java.messagingqueue.kafkaTutorial;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener(topics = "kafka_example",groupId = "group_id")
    public void kafkaConsumer(String msg){

        System.out.println("Message -- "+msg);
    }


    @KafkaListener(topics = "Kafka_example_json",groupId = "group_json",
            containerFactory = "concurrentKafkaListenerContainerFactoryForUser")
    public void kafkaConsumerJSON(KafkaUser user){
        System.out.println("Kafka User "+user.getName());

    }
}
