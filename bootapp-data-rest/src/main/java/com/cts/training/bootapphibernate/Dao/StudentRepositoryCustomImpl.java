package com.cts.training.bootapphibernate.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cts.training.bootapphibernate.entity.Student;
import com.cts.training.bootapphibernate.repository.StudentRepository;

public abstract class StudentRepositoryCustomImpl implements StudentRepository  {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Student> someVeryComplexRequirement() {
		// TODO Auto-generated method stub
		return null;
	
    }
}
