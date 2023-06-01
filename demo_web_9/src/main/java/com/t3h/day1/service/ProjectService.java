package com.t3h.day1.service;

import java.util.List;

import com.t3h.day1.dto.ProjectDto;

public interface ProjectService {

	List<ProjectDto> getProjectByUser(Long userId);
	public int count();
}
