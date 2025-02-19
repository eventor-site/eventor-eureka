package com.eventoreureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EventorEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventorEurekaApplication.class, args);
	}

}
