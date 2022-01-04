package com.poc.springboot.microservices.springbootmicroservicesuserservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.poc.springboot.microservices.springbootmicroservicesuserservice.entity.User;
import com.poc.springboot.microservices.springbootmicroservicesuserservice.repository.UserRepository;
import com.poc.springboot.microservices.springbootmicroservicesuserservice.vo.Department;
import com.poc.springboot.microservices.springbootmicroservicesuserservice.vo.ResponseTemplateVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		User user = userRepository.getById(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO(department,user);
		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department);
		return responseTemplateVO;
	}

}
