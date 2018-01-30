package com.incedo.rest.controller;


import java.util.Iterator;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.incedo.model.dto.Student;
import com.incedo.model.service.StudentService;
import com.incedo.responsebean.RootResponse;


@RestController
@RequestMapping("/student")
public class StudentController {


	/** The student service. */
	@Autowired
	private StudentService studentService;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public RootResponse<String> addStudent(@RequestBody Student student) throws Exception {
		System.out.println(student);
		studentService.addStudent(student);
		return new RootResponse<String>(true, "Student Added Successfully");

	}

	@RequestMapping(method = RequestMethod.GET, params = { "page", "limit",
			"start" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public RootResponse<Page<Student>> getAllStudents(@RequestParam("page") int page, @RequestParam("limit") int limit,
			@RequestParam("start") int start, @RequestParam(value = "sort", required = false) String sort)
			throws Exception {
		System.out.println(sort);
		Page<Student> students;
		String sortProperty = null;
		String sortDirection = null;
		Direction direction=null;
		page--;
		if (sort != null) {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootNode = objectMapper.readTree(sort);
			Iterator<JsonNode> elements = rootNode.elements();
			while (elements.hasNext()) {
				JsonNode node = elements.next();
				sortProperty = node.path("property").asText();
				sortDirection = node.path("direction").asText();
			}
			if (sortDirection.equals("ASC"))
				direction = Direction.ASC;
			if (sortDirection.equals("DESC"))
				direction = Direction.DESC;
			students = studentService.getAllStudents(page, limit, sortProperty, direction);
		} else {
			students = studentService.getAllStudents(page, limit);
		}
		System.out.println(students);
		return new RootResponse<Page<Student>>(true, students);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public RootResponse<String> updateStudent(@RequestBody Student student, @PathVariable int id) throws Exception {
		System.out.println(student);

		student.setId(id);
		studentService.addStudent(student);
		return new RootResponse<String>(true, "Student Updated Successfully");

	}

}
