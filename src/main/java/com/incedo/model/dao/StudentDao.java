package com.incedo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.model.dto.Student;
@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {
	 }
