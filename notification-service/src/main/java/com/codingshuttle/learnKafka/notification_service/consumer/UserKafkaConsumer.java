package com.codingshuttle.learnKafka.notification_service.consumer;

import com.codingshuttle.learnKafka.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserKafkaConsumer {

    @KafkaListener(topics = "user-created-topic")
    public void handleUserCreatedTopic(UserCreatedEvent userCreatedEvent) {
        log.info("handleUserCreatedTopic: {}", userCreatedEvent);
    }

    @KafkaListener(topics = "user-topic")
    public void handleUserTopic1(String message) {
        log.info("handleUserTopic1: {}", message);
    }

    @KafkaListener(topics = "user-topic")
    public void handleUserTopic2(String message) {
        log.info("handleUserTopic2: {}", message);
    }

    @KafkaListener(topics = "user-topic")
    public void handleUserTopic3(String message) {
        log.info("handleUserTopic3: {}", message);
    }
}
