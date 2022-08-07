package com.BikkadIT.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Student;
import com.BikkadIT.service.ServiceI;

@RestController
public class StudentController {

	@Autowired
	private ServiceI serviceI;
	

	@PostMapping(value="/addStudent",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		int id = serviceI.addStudent(student);
	
		return new ResponseEntity<Integer>(id,HttpStatus.CREATED);
		
	}
		
	@GetMapping(value = "/getallStudent",produces = "application/json")
	public ResponseEntity<List<Student>> getallStudent(){
		
		List<Student> getallStudent = serviceI.getallStudent();
		
		return new ResponseEntity<List<Student>>(getallStudent,HttpStatus.OK);
		}
	
	@GetMapping(value = "/getStudentById/{id}",produces = "application/json")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
		
		Student studentById = serviceI.getStudentById(id);
		
		return new ResponseEntity<Student>(studentById,HttpStatus.OK);
		
		
	}
	 
	
		
		
	

}
