package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.mavenweb.dao.IStudentDao;
import com.cts.training.mavenweb.entity.Product;
import com.cts.training.mavenweb.entity.Student;
import com.cts.training.mavenweb.services.IProductService;
import com.cts.training.mavenweb.services.IStudentService;

@Controller
@RequestMapping("/product")
public class ProductController {

	// dependency
	/*@Autowired
	private IStudentDao studentDao;*/
	
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		// get data from DAO layer
		// List<Student> students = this.studentDao.findAll();
		List<Product> products = ( this.productService).findAll();
		
		// add to model object
		model.addAttribute("products", products);
		
		// return the view page
		return "student-list";
	}
	
	@RequestMapping("/entry")
	public String entry(Model model) {
		
		Product product = new Product(); // empty bag
		
		// add empty bag to model , to be mapped with spring form
		model.addAttribute("products", product);
		
		return "product-entry";
	}
	
	@RequestMapping("/save")  // ALL TYPES OF HTTP VERB
	public String save(@ModelAttribute Product product) {
		// add validation
		
		// send student object to DAO via SERVICE
		this.productService.add(product);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/product/all";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model model) {
		
		// send id to DAO via SERVICE and get the student object to edit
		Product product =( this.productService).findById(id);
		
		// add student to model , to be mapped with spring form
		model.addAttribute("product", product);
		
		return "product-update";
	}
	
	
	// Path Variable
		@RequestMapping("/delete/{product}")
		public String delete(@PathVariable Integer product) {
			// send studentId to DAO via SERVICE
			this.productService.delete(product);
			
			// terminate the original request and start a new one
			
			// redirect to /all
			// return a redirect url
			return "redirect:/product/all";
		}
	
	@RequestMapping("/save-update")
	public String saveUpdate(@ModelAttribute Product product) {
		// add validation
		
		// send student object to DAO via SERVICE
		System.out.println(product.getName() + " : " + product.getCategory() +" : " + product.getCost());
		this.productService.update(product);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/product/all";
	}
	
	
	
}











