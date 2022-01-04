package com.poc.springboot.microservices.springbootmicroservicesuserservice.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.poc.springboot.microservices.springbootmicroservicesuserservice.entity.User;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseTemplateVO {

	private Department department;
	private User user;
	
	public ResponseTemplateVO(Department department, User user) {
		super();
		this.department = department;
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [department=" + department + ", user=" + user + "]";
	}
}
