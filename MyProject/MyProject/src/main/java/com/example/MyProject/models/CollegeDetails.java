package com.example.MyProject.models;

import java.math.BigInteger;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "COLLEGE_DETAILS")
public class CollegeDetails {
	@Id
	@SequenceGenerator(name = "COLLEGE_DETAILS_SID_SEQ", sequenceName = "COLLEGE_DETAILS_SID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COLLEGE_DETAILS_SID_SEQ")
	@Column(name = "COLLEGE_DETAILS_SID")
	private BigInteger collegeDetailsSid;
	@Column(name = "COLLEGE_ID")
	private String collegeId;
	@Column(name = "COLLEGE_NAME")
	private String collegeName;

	@OneToMany
	private Collection<Section> section;

	public BigInteger getCollegeDetailsSid() {
		return collegeDetailsSid;
	}

	public void setCollegeDetailsSid(BigInteger collegeDetailsSid) {
		this.collegeDetailsSid = collegeDetailsSid;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Collection<Section> getSection() {
		return section;
	}

	public void setSection(Collection<Section> section) {
		this.section = section;
	}

	
}
