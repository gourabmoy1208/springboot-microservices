package com.poc.springboot.microservices.springbootmicroservicescloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMenthodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallbackMethod() {
		return "User service is taking too much time ! fallback method ";
	}
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallbackMethod() {
		return "Department service is taking too much time ! fallback method ";
	}
}
