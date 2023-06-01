package com.t3h.day1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3h.day1.entity.Student;
import com.t3h.day1.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	Optional<Users> findById(Long id);
}
