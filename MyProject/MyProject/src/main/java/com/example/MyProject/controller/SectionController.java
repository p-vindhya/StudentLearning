package com.example.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.models.Section;
import com.example.MyProject.repository.SectionRepository;
import com.example.MyProject.service.SectionService;

@RestController
@RequestMapping("/api")
public class SectionController {

	@Autowired
	SectionService sectionService;
	@Autowired
	SectionRepository sectionRepository;

	@PostMapping("/addSection")
	public void addSections(@RequestBody Section section) {
		sectionService.addSections(section);
	}

	@GetMapping("/getSections")
	public List<Section> getSection() {
		return sectionRepository.findAll();
	}
}
