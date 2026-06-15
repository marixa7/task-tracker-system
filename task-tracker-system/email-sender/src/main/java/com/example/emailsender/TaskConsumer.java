package com.example.emailsender;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TaskConsumer {
    @KafkaListener(topics = "task-topic", groupId = "email-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
        // Здесь потом добавим логику отправки email через JavaMailSender
    }
}
