package com.kafka.Consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Consumer1Application {
	public static void main(String[] args) {
		SpringApplication.run(Consumer1Application.class, args);
	}

}
