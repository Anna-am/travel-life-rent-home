package com.travelly.renthomeservice.api.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@Configuration
@Slf4j
public class KafkaConsumerConfig {

    @KafkaListener
    public void consume(String message) {



    }
}
