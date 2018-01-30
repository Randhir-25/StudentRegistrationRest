package com.incedo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.model.dto.Skill;
import com.incedo.model.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {
	final static Logger logger = Logger.getLogger(SkillController.class);

	@Autowired
	private SkillService skillService;

	List<Skill> list = new ArrayList<Skill>();
	static int skillId = 0;

	@RequestMapping(value = { "" }, method = RequestMethod.GET, produces = { "application/json" })
	public List<Skill> getAllSkills() {
		return skillService.getAllSkills();
	}

}
