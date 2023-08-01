package com.example.MyProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.models.CollegeDetails;
import com.example.MyProject.service.CollegeDetailsService;

@RestController
@RequestMapping("/api")
public class CollegeDetailsController {

	
	@Autowired
	CollegeDetailsService collegeDetailsService;
	
	@PostMapping("/addCollegeDetails")
	public void addCollegeDetails(@RequestBody CollegeDetails collegeDetails) {
		collegeDetailsService.addCollegeDetails(collegeDetails);
	}
	
	
	
	
}
