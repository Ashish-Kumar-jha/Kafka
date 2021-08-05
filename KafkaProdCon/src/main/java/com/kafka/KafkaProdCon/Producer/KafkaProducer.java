package com.kafka.KafkaProdCon.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    @Value("${kafka.topic}")
    String topic;
    public void msg(String sms){
        for(int i=0;i<50;i++)
          kafkaTemplate.send(topic,sms+i);

    }
}
