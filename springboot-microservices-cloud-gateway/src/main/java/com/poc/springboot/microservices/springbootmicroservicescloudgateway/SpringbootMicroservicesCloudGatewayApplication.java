package com.poc.springboot.microservices.springbootmicroservicescloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootMicroservicesCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservicesCloudGatewayApplication.class, args);
	}

}
