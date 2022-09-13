package com.qa.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.student.entity.Student;
import com.qa.student.exception.StudentAlreadyExistsException;
import com.qa.student.service.StudentService;

@RestController
@RequestMapping("api/v1/student-service")
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	ResponseEntity<?> responseEntity;
	
	@PostMapping("/student")
	public ResponseEntity<?> saveEmployee(@RequestBody Student student) throws StudentAlreadyExistsException {
		Student createdStudent = this.stuService.saveStudent(student);
		responseEntity = new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
		return responseEntity;
		
	}
}
