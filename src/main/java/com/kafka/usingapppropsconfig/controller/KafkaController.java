package com.kafka.usingapppropsconfig.controller;

import com.kafka.usingapppropsconfig.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final Producer producer;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }
}
