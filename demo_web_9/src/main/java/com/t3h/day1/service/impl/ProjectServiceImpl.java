package com.t3h.day1.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t3h.day1.dto.ProjectDto;
import com.t3h.day1.entity.Projects;
import com.t3h.day1.entity.Users;
import com.t3h.day1.repository.ProjectRepository;
import com.t3h.day1.repository.UserRepository;
import com.t3h.day1.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<ProjectDto> getProjectByUser(Long userId) {
		
		Users user = userRepository.findById(userId).get();
		
		List<Projects> projectList = projectRepository.findByUser(user);
		
		
//		List<Projects> projectList = projectRepository.findAllByDate(new Date());
		List<ProjectDto> response = new ArrayList<>();
		
		
		for (Projects p : projectList) {
			response.add(ProjectDto.convert(p));
		}
		// TODO Auto-generated method stub
		return response;
	}
	
	@Override
	public int count() {
		return 1;
	}

}
