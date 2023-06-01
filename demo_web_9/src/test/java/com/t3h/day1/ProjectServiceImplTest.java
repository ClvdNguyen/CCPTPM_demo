package com.t3h.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.t3h.day1.entity.Projects;
import com.t3h.day1.entity.Users;
import com.t3h.day1.repository.ProjectRepository;
import com.t3h.day1.service.ProjectService;

@RunWith(SpringRunner.class)
@SpringBootTest // tạo ra các bean và ném vào context
public class ProjectServiceImplTest {

	// tạo ra 1 bean giả, giống với bean trong context
	@MockBean
	ProjectRepository projectRepository;
	
	@Autowired
	ProjectService projectService;
	
	@Before // giong @PostContruct
	public void setup() {
		List<Projects> tmp = new ArrayList<>();
		tmp.add(new Projects());
		tmp.add(new Projects());
		tmp.add(new Projects());
		
		Mockito.when(projectRepository.findByUser(new Users()))
		.thenReturn(tmp);
	}
	
	
	@Test
	public void test_getProjectByUser() {
//		Assert.assertEquals(3, projectRepository.findByUser(new Users()).size());
		Assert.assertEquals(3, projectService.getProjectByUser(1L).size());
		
	}
}
