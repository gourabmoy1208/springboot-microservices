package com.poc.springboot.microservices.springbootmicroservicesuserservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springboot.microservices.springbootmicroservicesuserservice.entity.User;
import com.poc.springboot.microservices.springbootmicroservicesuserservice.service.UserService;
import com.poc.springboot.microservices.springbootmicroservicesuserservice.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/save")
	public User saveUser(@RequestBody @Valid User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping(value = "{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}

}
