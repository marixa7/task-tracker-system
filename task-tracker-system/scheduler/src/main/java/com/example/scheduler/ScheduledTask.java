package com.example.scheduler;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduledTask {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public ScheduledTask(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 60000)
    public void sendScheduledMessage() {
        kafkaTemplate.send("task-topic", "Scheduled task at " + System.currentTimeMillis());
    }
}
