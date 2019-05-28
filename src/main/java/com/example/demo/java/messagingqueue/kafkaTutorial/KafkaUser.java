package com.example.demo.java.messagingqueue.kafkaTutorial;

public class KafkaUser {

    private String name;

    private String address;

    private String from;

    public KafkaUser(String name, String address, String from) {
        this.name = name;
        this.address = address;
        this.from = from;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    @Override
    public String toString() {
        return "KafkaUser{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
