package com.kafka.Consumer1.Controller;

import com.kafka.Consumer1.Services.ServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ConsumerController {
    @Autowired
    ServiceInter mongoDocInter;

    @KafkaListener(topics = "${kafka.topic}")
    public void listen(String message) {
        String payload = message;
        mongoDocInter.saveMongoData(payload);
        //System.out.println(payload);

    }
}
