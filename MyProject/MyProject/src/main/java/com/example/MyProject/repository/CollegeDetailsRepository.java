package com.example.MyProject.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyProject.models.CollegeDetails;

@Repository
public interface CollegeDetailsRepository extends JpaRepository<CollegeDetails, BigInteger>{
	
}
