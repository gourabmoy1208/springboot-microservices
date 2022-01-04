package com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.entity.Department;
import com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department getDepartmentByDepartmentId(Long departmentId) {
		return departmentRepository.getDepartmentByDepartmentId(departmentId);
	}

}
