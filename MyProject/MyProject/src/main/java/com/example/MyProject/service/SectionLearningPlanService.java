package com.example.MyProject.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.models.Section;
import com.example.MyProject.models.SectionLearningPlan;
import com.example.MyProject.repository.SectionLearningPlanRepository;
import com.example.MyProject.repository.SectionRepository;

@Service
public class SectionLearningPlanService {
	@Autowired
	SectionRepository sectionRepository;
	@Autowired 
	SectionLearningPlanRepository sectionLearningPlanRepository;
	BigInteger sectionLearningPlanSid;
	

	public SectionLearningPlan addSectionLearningPlan(SectionLearningPlan sectionLearningPlan) {
		List<Section> sectionList=new ArrayList<Section>();
		sectionRepository.findAll().forEach(sections -> sectionList.add(sections));
		
		for(Section s:sectionList) {
			if(sectionLearningPlan.getSectionId().equals(s.getSectionId()))
			sectionLearningPlan.setSectionSid(s.getSectionSid());
		}
		
		return sectionLearningPlanRepository.save(sectionLearningPlan);
		
	}

	public SectionLearningPlan updateSectionLearningPlan(SectionLearningPlan updatedSectionLearningPlan) {
		//String sectionId=updatedSectionLearningPlan.getSectionId();
		List<SectionLearningPlan> sectionLearningPlanList =new ArrayList<SectionLearningPlan>();
		sectionLearningPlanRepository.findAll().forEach(sections -> sectionLearningPlanList.add(sections));
		for(SectionLearningPlan s:sectionLearningPlanList) {
			if(updatedSectionLearningPlan.getSectionId().equals(s.getSectionId()) && updatedSectionLearningPlan.getTopic().equals(s.getTopic())) {
				sectionLearningPlanSid=s.getSectionLearningPlanSid();
			}
		}
		
		SectionLearningPlan sectionLearningPlan=sectionLearningPlanRepository.findById(sectionLearningPlanSid).get();
		SectionLearningPlan existingSectionLearningPlan=sectionLearningPlan;
		existingSectionLearningPlan.setPresentedBy(existingSectionLearningPlan.getPresentedBy());
		existingSectionLearningPlan.setEndTime(sectionLearningPlan.getEndTime());
		existingSectionLearningPlan.setSectionName(sectionLearningPlan.getSectionName());
		existingSectionLearningPlan.setZoomLink(sectionLearningPlan.getZoomLink());
		existingSectionLearningPlan.setLearningDate(sectionLearningPlan.getLearningDate());
		return sectionLearningPlanRepository.save(existingSectionLearningPlan);
		
	}

	public void deleteSectionLearningPlan(SectionLearningPlan sectionLearningPlan) {
		String sectionId=sectionLearningPlan.getSectionId();
		String topic =sectionLearningPlan.getTopic();
		List<SectionLearningPlan>sectionLearningPlanList=new ArrayList<SectionLearningPlan>();
		sectionLearningPlanRepository.findAll().forEach(sectionLearningPlans ->sectionLearningPlanList.add(sectionLearningPlans));
		for(SectionLearningPlan s:sectionLearningPlanList) {
			if(s.getSectionId().equals(sectionId) && s.getTopic().equals(topic)) {
				sectionLearningPlanSid=s.getSectionLearningPlanSid();
			}
		}
		sectionLearningPlanRepository.deleteById(sectionLearningPlanSid);
		
		
	}

	
	
	
	
	

}
