package com.islandsoftwaref250.shenlong.service.producer;

import com.islandsoftwaref250.shenlong.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaProducer {

    @Value("${spring.kafka.producer.topic-name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void sendMessage(Order message) {
        kafkaTemplate.send(topicName, message);
    }
}
