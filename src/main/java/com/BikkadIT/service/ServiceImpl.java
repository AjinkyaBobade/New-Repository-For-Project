package com.BikkadIT.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Student;
import com.BikkadIT.repository.StudentRepository;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public int addStudent(Student student) {
		Student save = studentRepository.save(student);
		return save.getStudentID();
	}

	@Override
	public List<Student> getallStudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student getStudentById(Integer id) {
		Student findById = studentRepository.findById(id).get();
		return findById;
	}

	

	

}
