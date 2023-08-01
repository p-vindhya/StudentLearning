package com.example.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.models.StudentLearningPlan;
import com.example.MyProject.repository.StudentLearningPlanRepository;
import com.example.MyProject.service.StudentLearningPlanService;

@RestController
@RequestMapping("/api")
public class StudentLearningPlanController {

	@Autowired
	StudentLearningPlanRepository studentLearningPlanRepository;
	@Autowired
	StudentLearningPlanService studentLearningPlanService;
	
	@GetMapping("/getStudentLearningPlanDetails")
	public List<StudentLearningPlan> getStudentLearningPlanDetails(){
		return studentLearningPlanRepository.findAll();
	}
	
	
	@PostMapping("/deleteStudentLearningPlanDetails")
	public void deleteStudentLearningPlanDetails(@RequestBody StudentLearningPlan studentLearningPlan) {
		studentLearningPlanService.deleteStudentLearningPlanDetails(studentLearningPlan);
	}
	
	@PostMapping("/addStudentLearningPlanDetails")
	public void getStudentLearningPlanDetails(@RequestBody StudentLearningPlan studentLearningPlan) {
		studentLearningPlanService.addStudentLearningPlanDetails(studentLearningPlan);
		
	}
}
