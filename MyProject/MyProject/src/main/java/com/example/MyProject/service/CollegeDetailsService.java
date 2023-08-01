package com.example.MyProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.models.CollegeDetails;
import com.example.MyProject.repository.CollegeDetailsRepository;

@Service
public class CollegeDetailsService {

	@Autowired
	CollegeDetailsRepository collegeDetailsRepository;

	public CollegeDetails addCollegeDetails(CollegeDetails collegeDetails) {

		return collegeDetailsRepository.save(collegeDetails);

	}

}
