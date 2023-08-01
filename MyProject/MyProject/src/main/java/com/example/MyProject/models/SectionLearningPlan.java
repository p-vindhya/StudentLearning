package com.example.MyProject.models;

import java.math.BigInteger;
import java.time.LocalTime;
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
@Table(name = "SECTION_LEARNING_PLAN")
public class SectionLearningPlan {

	@Id
	@SequenceGenerator(name = "SECTION_LEARNING_PLAN_SID_SEQ", sequenceName = "SECTION_LEARNING_PLAN_SID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SECTION_LEARNING_PLAN_SID_SEQ")
	@Column(name = "SECTION_LEARNING_PLAN")
	private BigInteger sectionLearningPlanSid;
	@Column(name = "TOPIC")
	private String topic;
	@Column(name = "SECTION_NAME")
	private String sectionName;
	@Column(name = "SECTION_ID")
	private String sectionId;
	@Column(name = "PRESENTED_BY")
	private String presentedBy;
	@Column(name = "LEARNING_DATE")
	private String learningDate;
	@Column(name = "START_TIME")
	private LocalTime startTime;
	@Column(name = "END_TIME")
	private LocalTime endTime;
	@Column(name = "ZOOM_LINK")
	private String zoomLink;
	@Column(name = "SECTION_SID")
	private BigInteger sectionSid;
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "SECTION_SID", insertable = false, updatable = false)
	private Section section;

	@ManyToMany
	@JoinTable(name = "SECTION_LEARNING_PLAN_STUDENT_LEARNING_PLAN", joinColumns = @JoinColumn(name = "SECTION_LEARNING_PLAN_SID"), inverseJoinColumns = @JoinColumn(name = "STUDENT_LEARNING_PLAN_SID"))
	private Collection<StudentLearningPlan> studentLearningPlan;

	public BigInteger getSectionLearningPlanSid() {
		return sectionLearningPlanSid;
	}

	public void setSectionLearningPlanSid(BigInteger sectionLearningPlanSid) {
		this.sectionLearningPlanSid = sectionLearningPlanSid;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
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

	public String getPresentedBy() {
		return presentedBy;
	}

	public void setPresentedBy(String presentedBy) {
		this.presentedBy = presentedBy;
	}

	public String getLearningDate() {
		return learningDate;
	}

	public void setLearningDate(String learningDate) {
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

	public String getZoomLink() {
		return zoomLink;
	}

	public void setZoomLink(String zoomLink) {
		this.zoomLink = zoomLink;
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
