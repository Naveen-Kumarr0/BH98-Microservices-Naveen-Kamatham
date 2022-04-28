package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	String getGrade(Student student) {
		
		if(student.getMarks()>100)
			return "Invalid Marks";
		if(student.getMarks()>=90)
			return student.getName() + " Got grade - A";
		if(student.getMarks()>=80)
			return student.getName() + " Got Grade - B";
		if(student.getMarks()>=70)
			return student.getName() + " Got Grade - C";
		return student.getName() + " Is Fail";
	}

}
