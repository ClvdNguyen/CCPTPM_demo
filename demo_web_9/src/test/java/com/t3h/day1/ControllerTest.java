package com.t3h.day1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.t3h.day1.controller.ProjectController;
import com.t3h.day1.dto.ProjectDto;
import com.t3h.day1.service.ProjectService;

@RunWith(SpringRunner.class)
@WebMvcTest(ProjectController.class)
public class ControllerTest {

	@Autowired
	MockMvc mvc;
	
	@MockBean
	ProjectService projectService;
	
	@Test
	public void test_getProject() throws Exception{
		List<ProjectDto> list = IntStream.range(0, 10)
				.mapToObj(i -> new ProjectDto(Long.valueOf(i), "name-"+i, "desc-" + i, i))
				.collect(Collectors.toList());
		
		
		BDDMockito.given(projectService.getProjectByUser(1L)).willReturn(list);
		
		mvc.perform(get("/project/1"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", hasSize(10)))
			.andExpect(jsonPath("$[9].id", is(9)))
		;
		
	}
}
