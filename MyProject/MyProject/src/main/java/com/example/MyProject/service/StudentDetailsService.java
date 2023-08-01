package com.example.MyProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.models.StudentDetails;
import com.example.MyProject.models.Section;
import com.example.MyProject.repository.StudentDetailsRepository;
import com.example.MyProject.repository.SectionRepository;

@Service
public class StudentDetailsService {

	@Autowired
	SectionRepository sectionRepository;
	
	@Autowired
	StudentDetailsRepository studentDetailsRepository;
	
	public StudentDetails getStudentDetails(StudentDetails studentDetails) {
		
		
		List<Section> sectionList=new ArrayList<Section>();
		sectionRepository.findAll().forEach(sections -> sectionList.add(sections));
		
		for(Section s:sectionList) {
			if(studentDetails.getSectionId().equals(s.getSectionId()))
		studentDetails.setSectionSid(s.getSectionSid());
		}
		
		return studentDetailsRepository.save(studentDetails);
	}

	

}
