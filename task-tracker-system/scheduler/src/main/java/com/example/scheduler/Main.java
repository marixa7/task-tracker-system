package com.example.scheduler; // Укажи свой пакет!

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableKafka // Это включит поддержку Kafka во всех твоих сервисах
@EnableScheduling // Добавь эту аннотацию только в сервис `scheduler`
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}