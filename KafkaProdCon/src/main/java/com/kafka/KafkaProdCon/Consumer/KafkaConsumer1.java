package com.kafka.KafkaProdCon.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer1 {
    @KafkaListener(topics = "${kafka.topic}", groupId = "ashish1")
    public void listen(Message<String> message){
        System.out.println("COMSUMER 1");
        String payload=message.getPayload();
        System.out.println(payload);
    }
}
