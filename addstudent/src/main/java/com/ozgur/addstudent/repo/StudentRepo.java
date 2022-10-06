package com.ozgur.addstudent.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozgur.addstudent.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
