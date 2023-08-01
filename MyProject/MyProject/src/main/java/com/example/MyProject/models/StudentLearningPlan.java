package com.example.MyProject.models;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_LEARNING_PLAN")
public class StudentLearningPlan {
	@Id
	@SequenceGenerator(name = "STUDENT_LEARNING_PLAN_SID_SEQ", sequenceName = "STUDENT_LEARNING_PLAN_SID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDENT_LEARNING_PLAN_SID_SEQ")

	@Column(name = "STUDENT_LEARNING_PLAN")
	private BigInteger studentLearningPlanSid;
	@Column(name = "TOPIC")
	private String Topic;
	@Column(name="SECTION_NAME")
	private String sectionName;
	@Column(name = "STUDENT_ID")
	private String studentId;
	@Column(name = "LEARNING_DATE")
	private LocalDate learningDate;
	@Column(name = "START_TIME")
	private LocalTime startTime;
	@Column(name = "END_TIME")
	private LocalTime endTime;
	@Column(name = "STUDENTS_SID")
	private BigInteger studentsSid;
	@Column(name = "SECTION_LEARNING_PLAN_SID")
	private BigInteger sectionLearningPlanSid;

	@ManyToMany(mappedBy = "studentLearningPlan", fetch = FetchType.LAZY)
	private Collection<SectionLearningPlan> sectionLearningPlan;

	@ManyToMany(mappedBy = "studentLearningPlan", fetch = FetchType.LAZY)
	private Collection<StudentDetails> studentDetails;

	public BigInteger getStudentLearningPlanSid() {
		return studentLearningPlanSid;
	}

	public void setStudentLearningPlanSid(BigInteger studentLearningPlanSid) {
		this.studentLearningPlanSid = studentLearningPlanSid;
	}

	public String getTopic() {
		return Topic;
	}

	public void setTopic(String topic) {
		Topic = topic;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public LocalDate getLearningDate() {
		return learningDate;
	}

	public void setLearningDate(LocalDate learningDate) {
		this.learningDate = learningDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public BigInteger getStudentsSid() {
		return studentsSid;
	}

	public void setStudentsSid(BigInteger studentsSid) {
		this.studentsSid = studentsSid;
	}

	public BigInteger getSectionLearningPlanSid() {
		return sectionLearningPlanSid;
	}

	public void setSectionLearningPlanSid(BigInteger sectionLearningPlanSid) {
		this.sectionLearningPlanSid = sectionLearningPlanSid;
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
