package com.example.demo.java.jmsdemo.activemqstandalone;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;

@Configuration
public class Config {


        @Value("${activemq.broker-url}")
        private String brokerUrl;

        public Queue activeMqQueue(){
                return new ActiveMQQueue("standalone.queue");
        }


        public ActiveMQConnectionFactory activeMQConnectionFactory(){
                ActiveMQConnectionFactory factory=new ActiveMQConnectionFactory();
                factory.setBrokerURL(brokerUrl);
                return factory;
        }



        public JmsTemplate jmsTemplate(){
                return new JmsTemplate(activeMQConnectionFactory());
        }

}
