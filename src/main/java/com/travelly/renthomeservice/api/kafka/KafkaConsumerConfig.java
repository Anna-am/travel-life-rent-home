package com.travelly.renthomeservice.api.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.travelly.renthomeservice.api.dto.PropertiesDto;
import com.travelly.renthomeservice.api.util.JsonMapper;
import com.travelly.renthomeservice.api.util.PropertiesMapper;
import com.travelly.renthomeservice.service.PropertyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@EnableKafka
@Configuration
//@AllArgsConstructor
@Slf4j
public class KafkaConsumerConfig {

//    private final JsonMapper jsonMapper;
//    private final PropertyService propertyService;
//    private final PropertiesMapper propertiesMapper;

    @Bean
    public Map<String, Object> consumerConfig() {

        Map<String, Object> properties = new HashMap<>();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class.getName());
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "groupConsumer");
        return properties;
    }

    @Bean
    public ConsumerFactory<String, PropertiesMessage> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(
                consumerConfig(),
                new StringDeserializer(),
                new JsonDeserializer<>(PropertiesMessage.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, PropertiesMessage> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, PropertiesMessage> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

//    KafkaConsumer<Integer, PropertiesDto> consumer = new KafkaConsumer<>(properties);
//        consumer.subscribe(Collections.singleton("tg_property_pub"));
//        log.info("message received");
//
//        while(true)
//
//    {
//        ConsumerRecords<Integer, PropertiesDto> consumerRecords = consumer.poll(Duration.ofMillis(100));
//        for (ConsumerRecord<Integer, PropertiesDto> record : consumerRecords) {
//            com.travelly.renthomeservice.entity.Properties property = propertyService.addProperty(record.value());
//            log.info("Property with id {} was added to db", property.getId());
//        }
//    }

}
