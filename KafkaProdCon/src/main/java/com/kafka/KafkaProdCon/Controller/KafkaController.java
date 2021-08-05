package com.kafka.KafkaProdCon.Controller;

import com.kafka.KafkaProdCon.Producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    KafkaProducer kafkaProducer;
    @PostMapping("/kafka/{msg}")
    public String callproduce(@PathVariable String msg){

        kafkaProducer.msg(msg);
        return "CONTROLLER PROCESS COMPLETED";
    }
}
