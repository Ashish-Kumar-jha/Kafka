package com.kafka.Consumer2.Controller;

import com.kafka.Consumer2.Service.ServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerController {

   @Autowired
    ServiceInter serviceInter;


    @KafkaListener(topics = "${kafka.topic}")
    public void listen(String sms){
        serviceInter.saveCassandra(sms);
    }
}
