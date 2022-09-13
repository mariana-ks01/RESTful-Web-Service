package com.qa.student.service;

import java.util.List;

import com.qa.student.entity.Student;
import com.qa.student.exception.StudentAlreadyExistsException;

public interface IStudentService {
	//CRUD Operations
	public Student saveStudent(Student student) throws StudentAlreadyExistsException;
	/*
	 * public List<Student> getAllStudents(); public Student getStudentById(int id);
	 * public Student updateStudent (int id, Student student); public boolean
	 * deleteStudent(int id);
	 */
}
