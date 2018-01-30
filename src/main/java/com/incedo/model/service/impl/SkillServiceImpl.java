package com.incedo.model.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.incedo.model.dao.SkillDao;
import com.incedo.model.dto.Skill;
import com.incedo.model.service.SkillService;

@Service
@Transactional
public class SkillServiceImpl implements SkillService {


	@Autowired
	SkillDao skillDao;


	@Transactional(readOnly = true)
	public List<Skill> getAllSkills() {
		return skillDao.findAll();
	}
	
}
