package com.example.MyProject.models;

import java.math.BigInteger;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SECTION")
public class Section {
	@Id
	@SequenceGenerator(name = "SECTION_SID_SEQ", sequenceName = "SECTION_SID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SECTION_SID_SEQ")
	@Column(name = "SECTION_SID")
	private BigInteger sectionSid;
	@Column(name = "SECTION_NAME")
	private String sectionName;
	@Column(name = "SECTION_ID")
	private String sectionId;
	
	
	@Column(name = "COLLEGE_DETAILS_SID")
	private BigInteger collegeDetailsSid;
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "COLLEGE_DETAILS_SID", insertable = false, updatable = false)
	private CollegeDetails collegeDetails;

	@OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
	private Collection<SectionLearningPlan> sectionLearningPlan;

	@OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
	private Collection<StudentDetails> studentDetails;

	public BigInteger getSectionSid() {
		return sectionSid;
	}

	public void setSectionSid(BigInteger sectionSid) {
		this.sectionSid = sectionSid;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public BigInteger getCollegeDetailsSid() {
		return collegeDetailsSid;
	}

	public void setCollegeDetailsSid(BigInteger collegeDetailsSid) {
		this.collegeDetailsSid = collegeDetailsSid;
	}

	public CollegeDetails getCollegeDetails() {
		return collegeDetails;
	}

	public void setCollegeDetails(CollegeDetails collegeDetails) {
		this.collegeDetails = collegeDetails;
	}

	public Collection<SectionLearningPlan> getSectionLearningPlan() {
		return sectionLearningPlan;
	}

	public void setSectionLearningPlan(Collection<SectionLearningPlan> sectionLearningPlan) {
		this.sectionLearningPlan = sectionLearningPlan;
	}

	public Collection<StudentDetails> getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(Collection<StudentDetails> studentDetails) {
		this.studentDetails = studentDetails;
	}

	
	
}