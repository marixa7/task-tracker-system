package com.example.emailsender; // Укажи свой пакет!

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka // Это включит поддержку Kafka во всех твоих сервисах
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}