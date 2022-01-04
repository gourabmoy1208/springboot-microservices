package com.poc.springboot.microservices.springbootmicroservicesdepartmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootMicroservicesDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservicesDepartmentServiceApplication.class, args);
	}

}
