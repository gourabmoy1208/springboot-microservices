package com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.springboot.microservices.springbootmicroservicesdepartmentservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department getDepartmentByDepartmentId(Long departmentId); 

}
