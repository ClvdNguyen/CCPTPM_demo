package com.t3h.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.t3h.day1.dto.ProjectDto;
import com.t3h.day1.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/project/{userId}")
	public List<ProjectDto> getNumProjectByUser(@PathVariable Long userId) {
		return projectService.getProjectByUser(userId);
	}
}
