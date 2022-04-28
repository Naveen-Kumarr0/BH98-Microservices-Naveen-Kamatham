package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	private final StudentRepo studentRepo;
	public StudentController(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;

	}

	@GetMapping("/students")
	List<Student> getAll() {
		return studentRepo.findAll();

	}

	@GetMapping("/student/{id}")
	String get(@PathVariable Long id) {
		return studentService.getGrade(studentRepo.getById(id));

	}

}
