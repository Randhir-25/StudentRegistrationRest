package com.incedo.model.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.incedo.model.dao.StudentDao;
import com.incedo.model.dto.Student;
import com.incedo.model.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {


	@Autowired
	StudentDao studentDao;


	@Override
	@Transactional(readOnly = true)
	public Page<Student> getAllStudents(int page,int size) {
		Pageable pageable=new PageRequest(page, size);
		return studentDao.findAll(pageable);
	}
	
	@Override
	public Page<Student> getAllStudents(int page, int size, String sortProperty, Direction direction) {
		Sort sort=new Sort(direction, sortProperty);
		return studentDao.findAll(new PageRequest(page, size, sort));
	}
	
	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}
	@Override
	public Student getStudentById(int id) {
		return studentDao.findOne(id);
	}
	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

}
