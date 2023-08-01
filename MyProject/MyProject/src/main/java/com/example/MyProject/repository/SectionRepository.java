package com.example.MyProject.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MyProject.models.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, BigInteger> {

	Section findBySectionId(@Param("sectionId")String sectionId);

}
