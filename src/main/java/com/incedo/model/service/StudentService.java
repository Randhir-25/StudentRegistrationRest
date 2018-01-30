package com.incedo.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.incedo.model.dto.Student;

public interface StudentService {

	Page<Student> getAllStudents(int page,int size);
	Page<Student> getAllStudents(int page,int size,String sortProperty,Sort.Direction direction);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student getStudentById(int id);

}
