package com.example.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.models.StudentDetails;
import com.example.MyProject.repository.StudentDetailsRepository;
import com.example.MyProject.service.StudentDetailsService;

@RestController
@RequestMapping("/api")
public class StudentDetailsController {
	
	@Autowired
	StudentDetailsService studentDetailsService;
	@Autowired
	StudentDetailsRepository studentDetailsRepository;
	
	@PostMapping("/addStudentDetails")
	public void getStudentDetails(@RequestBody StudentDetails studentDetails) {
		studentDetailsService.getStudentDetails(studentDetails);
	}
	
	@GetMapping("/getStudentDetails")
	public List<StudentDetails> getStudentDetails() {
		return studentDetailsRepository.findAll();
	}
	
}
