package com.kafka.usingapppropsconfig.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "kafka-topic", groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
