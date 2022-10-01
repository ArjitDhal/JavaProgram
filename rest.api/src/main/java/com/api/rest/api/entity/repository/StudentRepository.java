package com.api.rest.api.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.api.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
		Student findByName(String  name);

		 
	

}
