package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.model.Student;


public interface ServiceI {

	public int addStudent(Student student);
	
	public List<Student> getallStudent();
	
	public Student getStudentById(Integer id);
}
