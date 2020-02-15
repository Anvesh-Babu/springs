package com.cts.training.mavenweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.training.mavenweb.dao.ICasestudyDao;
import com.cts.training.mavenweb.entity.Student;

// @Component
@Service
public class CasestudyServiceImpl implements ICasestudyService {

	@Autowired
	private ICasestudyDao casestudyDao;
	
	@Override
	public List<Student> findAllStudents() {
		// add additional logic
		return this.casestudyDao.findAll();
	}

	@Override
	public Student findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return this.casestudyDao.findById(id);
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return this.casestudyDao.add(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.casestudyDao.update(student);
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return this.casestudyDao.delete(id);
	}

}
