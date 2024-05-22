package com.employee.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import lombok.*;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
@Component
public class GlobalExceptionHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error HandleInvalidEmployeeId(IllegalArgumentException exception)
	{
		System.out.println("Invalid Employee Id"+exception.getMessage());
		return Error
				         .builder()
				         .code(100)
				         .message(exception.getMessage())
				         .build();
	}  
}
@Builder
@AllArgsConstructor
@Getter
class Error
{
	private int code;
	private String message;
}

