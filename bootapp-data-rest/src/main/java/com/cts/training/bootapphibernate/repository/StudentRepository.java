package com.cts.training.bootapphibernate.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cts.training.bootapphibernate.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	List<Student> findStudentsByEmail(String email);
	Student findByEmail(String email);
	
	// get all students having age > (provided age) and gpa > (provided gpa)
	@Query("select s from Student s where s.age > :providedAge and s.gpa > :providedGpa")
	List<Student> getStudentsOfSpecificCriteria(@Param("providedAge") Integer age, @Param("providedGpa") Double gpa);
	
	}


