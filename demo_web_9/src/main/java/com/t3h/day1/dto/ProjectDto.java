package com.t3h.day1.dto;

import javax.persistence.Column;

import com.t3h.day1.entity.Projects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*; 

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
	private Long id;

	private String name;

	private String desc;

	private Integer memberCnt;
	
	public static ProjectDto convert(Projects p) {
		ProjectDto project = new ProjectDto();
		project.setId(p.getId());
		project.setDesc(p.getDesc());
		project.setName(p.getName());
		project.setMemberCnt(p.getMemberCnt());
		
		return project;
	}
	
	

}
