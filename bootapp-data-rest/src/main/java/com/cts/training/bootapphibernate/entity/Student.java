package com.cts.training.bootapphibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Integer id;
		@Column
		private String name;
		@Column
		private String category;
		@Column
		private Integer cost;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public Integer getCost() {
			return cost;
		}
		public void setCost(Integer cost) {
			this.cost = cost;
		}
		
		
		
	}


