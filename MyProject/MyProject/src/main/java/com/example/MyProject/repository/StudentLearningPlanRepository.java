package com.example.MyProject.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyProject.models.StudentLearningPlan;

@Repository
public interface  StudentLearningPlanRepository extends JpaRepository<StudentLearningPlan, BigInteger> {

}
