package com.example.backend;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public TaskController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/send")
    public String sendTask(@RequestParam String message) {
        kafkaTemplate.send("task-topic", message);
        return "Message sent to Kafka: " + message;
    }
}
