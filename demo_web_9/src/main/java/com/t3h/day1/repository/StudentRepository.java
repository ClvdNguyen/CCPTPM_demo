package com.t3h.day1.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.t3h.day1.entity.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
//	public interface StudentRepository extends JpaRepository<Student, Integer> {
//	public interface StudentRepository extends CrudRepository<Student, Integer> {
	List<Student> findAll();

	Page<Student> findAll(Pageable pageable);
	
	Optional<Student> findById(Long id);

	List<Student> findByLastName(String lastName);

	List<Student> findByLastNameAndFirstName(String lastName, String firstName);
	
//	@Query("Select s from Student s where s.lastName = :abc and s.firstName = ?2")
//	List<Student> findByNameDemo(@Param(value = "abc") String lastName, String firstName);
//
//	@Query(value = "select * from student", nativeQuery = true)
//	List<Student> findByNameDemo2(String lastName, String firstName);
	
	@Query("SELECT s.firstName as firstName, SUM(s.mathPoint) as sum FROM Student s GROUP BY firstName")
	List<Map<Object, Object>> getTotalPoint();
	
	@Query(value = "select first_name, sum(m_point) as sum from student group by first_name", nativeQuery = true)
	List<Map<Object, Object>> getTotalPointnative();
	
}
