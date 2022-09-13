package com.qa.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Student Already Exists with this email")
public class StudentAlreadyExistsException extends Exception{
}
