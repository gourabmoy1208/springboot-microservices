package com.poc.springboot.microservices.springbootmicroservicesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class SpringbootMicroservicesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservicesConfigServerApplication.class, args);
	}

}
