package com.ozgur.addstudent.service;

import java.util.List;

import com.ozgur.addstudent.model.Student;

public interface StudentServiceI {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
