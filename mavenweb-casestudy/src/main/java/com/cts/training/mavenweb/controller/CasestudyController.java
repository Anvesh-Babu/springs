package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.mavenweb.dao.ICasestudyDao;
import com.cts.training.mavenweb.entity.Student;
import com.cts.training.mavenweb.services.ICasestudyService;

@Controller
@RequestMapping("/student")
public class CasestudyController {

	// dependency
	/*@Autowired
	private ICasestudyDao studentDao;*/
	
	@Autowired
	private ICasestudyService casestudyService;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		// get data from DAO layer
		// List<Student> students = this.studentDao.findAll();
		List<Student> students = this.casestudyService.findAllStudents();
		
		// add to model object
		model.addAttribute("students", students);
		
		// return the view page
		return "student-list";
	}
	
	@RequestMapping("/entry")
	public String entry(Model model) {
		
		Student student = new Student(); // empty bag
		
		// add empty bag to model , to be mapped with spring form
		model.addAttribute("student", student);
		
		return "student-entry";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Student student) {
		// add validation
		
		// send student object to DAO via SERVICE
		this.casestudyService.addStudent(student);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/student/all";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model model) {
		
		// send id to DAO via SERVICE and get the student object to edit
		Student student = this.casestudyService.findStudentById(id);
		
		// add student to model , to be mapped with spring form
		model.addAttribute("student", student);
		
		return "student-update";
	}
	
	
	// Path Variable
		@RequestMapping("/delete/{studentId}")
		public String delete(@PathVariable Integer studentId) {
			// send studentId to DAO via SERVICE
			this.casestudyService.deleteStudent(studentId);
			
			// terminate the original request and start a new one
			
			// redirect to /all
			// return a redirect url
			return "redirect:/student/all";
		}
	
	@RequestMapping("/save-update")
	public String saveUpdate(@ModelAttribute Student student) {
		// add validation
		
		// send student object to DAO via SERVICE
		System.out.println(student.getName() + " : " + student.getId());
		this.casestudyService.updateStudent(student);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/student/all";
	}
	
	
	
}











