package com.kafka.DataReceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DataReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataReceiverApplication.class, args);
	}

}
