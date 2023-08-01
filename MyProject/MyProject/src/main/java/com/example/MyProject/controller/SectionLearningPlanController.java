package com.example.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.models.SectionLearningPlan;
import com.example.MyProject.repository.SectionLearningPlanRepository;
import com.example.MyProject.service.SectionLearningPlanService;

@RestController
@RequestMapping("/api")
public class SectionLearningPlanController {
@Autowired
SectionLearningPlanService sectionLearningPlanService;

@Autowired 
SectionLearningPlanRepository sectionLearningPlanRepository;

	
	@PostMapping("/addSectionLearningPlan")
	public void addSectionLearningPlan(@RequestBody SectionLearningPlan sectionLearningPlan) {
		sectionLearningPlanService.addSectionLearningPlan(sectionLearningPlan);
	}
	
	@GetMapping("/getSectionLearningPlan")
	public List<SectionLearningPlan> getSectionLearningPlan(){
		return sectionLearningPlanRepository.findAll();
	}
	
	@PutMapping("/updateSectionLearningPlan")
	public void updateSectionLearningPlan(@RequestBody SectionLearningPlan sectionLearningPlan) {
		sectionLearningPlanService.updateSectionLearningPlan(sectionLearningPlan);
	}
	
	
	@PostMapping("/deleteSectionLearningPlan")
	public void deleteSectionLearningPlan(@RequestBody SectionLearningPlan sectionLearningPlan) {
		sectionLearningPlanService.deleteSectionLearningPlan(sectionLearningPlan);
	}
}
