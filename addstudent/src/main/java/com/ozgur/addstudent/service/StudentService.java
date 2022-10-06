package com.ozgur.addstudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozgur.addstudent.model.Student;
import com.ozgur.addstudent.repo.StudentRepo;


@Service
public class StudentService implements StudentServiceI{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	
}
