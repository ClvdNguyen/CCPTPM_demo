package com.t3h.day1.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.t3h.day1.entity.Projects;
import com.t3h.day1.entity.Users;
import com.t3h.day1.model.Student;

public interface ProjectRepository extends JpaRepository<Projects, Long>{

	List<Projects> findByUser(Users user);
	
//	List<Student> findTest();

	@Query("Select p from Projects p where p.user.id = :userId")
	List<Projects> findProject(Long userId);
	
	@Query("Select p from Projects p where p.createdAt < :date1")
	List<Projects> findAllByDate(@Param(value = "date1")Date createdAt);
}
