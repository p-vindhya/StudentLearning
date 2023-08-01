package com.example.MyProject.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MyProject.models.SectionLearningPlan;

@Repository
public interface  SectionLearningPlanRepository  extends JpaRepository<SectionLearningPlan, BigInteger>{

	List<SectionLearningPlan> findBySectionName(@Param("sectionName") String sectionName);

}
