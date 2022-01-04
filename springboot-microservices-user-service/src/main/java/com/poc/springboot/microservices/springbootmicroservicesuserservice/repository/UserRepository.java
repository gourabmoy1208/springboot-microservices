package com.poc.springboot.microservices.springbootmicroservicesuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.springboot.microservices.springbootmicroservicesuserservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
