package com.kafka.Producer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class ProducerController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @Value("${kafka.topic}")
    String topic;

    @PostMapping("/producer/{sms}")
    public String sendData(@PathVariable String sms) {
        for (int i=0; i<10; i++) {
            kafkaTemplate.send(topic, sms + "--"+i);
        }
        return "Data Send To Broker";
    }
}
