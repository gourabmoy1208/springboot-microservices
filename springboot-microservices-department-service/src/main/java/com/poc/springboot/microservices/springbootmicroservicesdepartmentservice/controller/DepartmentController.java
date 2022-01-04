package com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.entity.Department;
import com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping(value = "/save")
	public @ResponseBody Department saveDepartment(@RequestBody Department department) {
		LOG.info("inside DepartmentController savedepartment() : ");
		return departmentService.saveDepartment(department);
	}

	@GetMapping(value = "{id}")
	public @ResponseBody Department getDepartmentById(@PathVariable(value = "id") Long departmentId) {
		LOG.info("received  departmentId from request : " + departmentId);
		LOG.info("inside DepartmentController savedepartment() : ");
		return departmentService.getDepartmentByDepartmentId(departmentId);
	}

}
