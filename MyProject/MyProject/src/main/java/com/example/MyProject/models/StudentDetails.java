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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "STUDENT_DETAILS")
public class StudentDetails {
	@Id
	@SequenceGenerator(name = "STUDENT_DETAILS_SID_SEQ", sequenceName = "STUDENT_DETAILS_SID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDENT_DETAILS_SID_SEQ")

	@Column(name = "STUDENT_SID")
	private BigInteger studentSid;
	@Column(name = "STUDENT_NAME")
	private String studentName;
	@Column(name = "STUDENT_ID")
	private String studentId;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "SECTION_ID")
	private String sectionId;

	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "SECTION_SID")
	private BigInteger sectionSid;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "SECTION_SID", insertable = false, updatable = false)
	private Section section;

	@ManyToMany
	@JoinTable(name = "STUDENT_DETAILS_STUDENT_LEARNING_PLAN", joinColumns = @JoinColumn(name = "STUDENT_DETAILS_SID"), inverseJoinColumns = @JoinColumn(name = "STUDENT_LEARNING_PLAN_SID"))
	private Collection<StudentLearningPlan> studentLearningPlan;

	public BigInteger getStudentSid() {
		return studentSid;
	}

	public void setStudentSid(BigInteger studentSid) {
		this.studentSid = studentSid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getSectionSid() {
		return sectionSid;
	}

	public void setSectionSid(BigInteger sectionSid) {
		this.sectionSid = sectionSid;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Collection<StudentLearningPlan> getStudentLearningPlan() {
		return studentLearningPlan;
	}

	public void setStudentLearningPlan(Collection<StudentLearningPlan> studentLearningPlan) {
		this.studentLearningPlan = studentLearningPlan;
	}

	
}
