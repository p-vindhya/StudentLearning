package com.example.MyProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.models.CollegeDetails;
import com.example.MyProject.models.Section;
import com.example.MyProject.repository.CollegeDetailsRepository;
import com.example.MyProject.repository.SectionRepository;

@Service
public class SectionService {

	@Autowired
	SectionRepository sectionRepository;

	@Autowired
	CollegeDetailsRepository collegeDetailsRepository;

	public Section addSections(Section section) {

		List<CollegeDetails> collegeList = new ArrayList<CollegeDetails>();
		collegeDetailsRepository.findAll().forEach(college -> collegeList.add(college));

		for (CollegeDetails c : collegeList) {

			section.setCollegeDetailsSid(c.getCollegeDetailsSid());
		}
		return sectionRepository.save(section);

	}


}
