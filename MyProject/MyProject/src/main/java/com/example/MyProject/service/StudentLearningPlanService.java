package com.example.MyProject.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.models.StudentLearningPlan;
import com.example.MyProject.models.SectionLearningPlan;
import com.example.MyProject.repository.StudentLearningPlanRepository;
import com.example.MyProject.repository.SectionLearningPlanRepository;

@Service
public class StudentLearningPlanService {
	@Autowired
	StudentLearningPlanRepository studentLearningPlanRepository;
	@Autowired
	SectionLearningPlanRepository squadLearningPlanRepository;
	BigInteger studentLearningPlanSid;
	public void deleteStudentLearningPlanDetails(StudentLearningPlan studentLearningPlan) {
		List<StudentLearningPlan> studentLearningPlanList=new ArrayList<StudentLearningPlan>();
		studentLearningPlanRepository.findAll().forEach(studentLearningPlans -> studentLearningPlanList.add(studentLearningPlans));
		for(StudentLearningPlan a: studentLearningPlanList) {
			if(a.getStudentId().equals(studentLearningPlan.getStudentId()) && a.getTopic().equals(studentLearningPlan.getTopic())) {
				studentLearningPlanSid=a.getStudentLearningPlanSid();
			}
		}
		studentLearningPlanRepository.deleteById(studentLearningPlanSid);
	}
	public void addStudentLearningPlanDetails(StudentLearningPlan studentLearningPlan) {
		List<SectionLearningPlan> squadLearningPlanList=squadLearningPlanRepository.findBySectionName(studentLearningPlan.getSectionName());
		for(SectionLearningPlan s:squadLearningPlanList) {
			if(s.getTopic().equals(studentLearningPlan.getTopic())){
				studentLearningPlan.setSectionLearningPlanSid(s.getSectionLearningPlanSid());
			}
		}
		studentLearningPlanRepository.save(studentLearningPlan);
		
	}

}
