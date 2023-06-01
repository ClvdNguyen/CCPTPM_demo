package com.t3h.day1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.t3h.day1.model.Student;
import com.t3h.day1.repository.ProjectRepository;
import com.t3h.day1.service.ProjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

	// day la mock bean, ko phai bean trong context
	@MockBean
	private ProjectRepository projectRepository;

	@Autowired
	private ProjectService projectService;

	@Before
	public void setup() {
//		System.out.println("Test init~~~~");
//		Mockito.when(projectRepository.findTest()).thenReturn(IntStream.range(0, 10)
//				.mapToObj(i -> new Student("firstName-" + i, "lastName-" + i)).collect(Collectors.toList())
//
//		);
	}

	@Test
	public void test1() {
		Assert.assertEquals(10, projectService.count());
	}
}
