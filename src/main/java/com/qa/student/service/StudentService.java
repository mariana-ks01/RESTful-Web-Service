package com.qa.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.student.entity.Student;
import com.qa.student.exception.StudentAlreadyExistsException;
import com.qa.student.repository.StudentRepository;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	StudentRepository stuRepository;
	
	@Override
	public Student saveStudent(Student student) throws StudentAlreadyExistsException{
		/*
		 * 1. Check whether student already exists with the name
		 * 2. If yes, throw StudentAlreadyExistsException
		 * 3. If no, save the student object into the database
		 * 4. Return the saved student
		 */

	Optional<Student> findByEmail = stuRepository.findByEmail(student.getEmail());
	if(findByEmail.isPresent())
			throw new StudentAlreadyExistsException();
	else
		return stuRepository.save(student);
		
	}

	/*
	 * @Override public List<Student> getAllStudents() { return
	 * stuRepository.findAll(); }
	 * 
	 * @Override public Student getStudentById(int id) { Optional<Student>
	 * existingOptional = stuRepository.findById(id); Student existing =
	 * existingOptional.get(); return existing; }
	 * 
	 * @Override public Student updateStudent(int id, Student student) {
	 * Optional<Student> existingOptional = stuRepository.findById(id); Student
	 * existing = existingOptional.get();
	 * 
	 * existing.setAge(student.getAge()); existing.setName(student.getName());
	 * return stuRepository.save(existing); }
	 * 
	 * @Override public boolean deleteStudent(int id) {
	 * stuRepository.deleteById(id); boolean exists = stuRepository.existsById(id);
	 * return !exists; }
	 */
}
