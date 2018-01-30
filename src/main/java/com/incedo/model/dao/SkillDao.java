package com.incedo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.model.dto.Skill;
@Repository
public interface SkillDao extends JpaRepository<Skill, Integer>{
	 
	 
}
