package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	private @Id @GeneratedValue Long rollno;
	private String name;
	private Long marks;

	Student() {
	}

	public Student(Long rollno, String name, Long marks) {
		super();
		this.rollno = rollno;
		this.name = name;

		this.marks = marks;
	}

	public Long getRollno() {
		return rollno;
	}

	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(rollno, other.rollno);
	}

}