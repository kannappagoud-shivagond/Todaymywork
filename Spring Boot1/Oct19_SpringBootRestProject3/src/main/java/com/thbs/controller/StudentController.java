package com.thbs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.model.Student;
import com.thbs.repo.StudentRepo;

@RestController
@RequestMapping("/Students")
public class StudentController {
	StudentRepo sr=new StudentRepo();
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>>getAllStudentsDetails()
	{
		List<Student> slist=sr.getAllStudents();
		return new ResponseEntity<List<Student>>(slist,HttpStatus.OK);
	}
	
	@GetMapping("/getAStudent/{id}")
	public ResponseEntity<Student>getAStudent(@PathVariable int id)
	{
		Student s=sr.getAStudent(id);
		if(s!=null)
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		else
			return new ResponseEntity<Student>(s,HttpStatus.NOT_FOUND);
	}

}
