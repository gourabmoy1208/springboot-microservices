package com.poc.springboot.microservices.springbootmicroservicesuserservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.poc.springboot.microservices.springbootmicroservicesuserservice.vo.APIErrorVO;

@ControllerAdvice
public class APIExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public APIErrorVO handleValidationErrot(MethodArgumentNotValidException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		FieldError fieldError = bindingResult.getFieldError();
		String errorMessage = fieldError.getDefaultMessage();
		return new APIErrorVO("VALIDATION FAILED", errorMessage);
	}
	
}
