package com.cts.training.mavenweb.services;

import java.util.List;

import com.cts.training.mavenweb.entity.Product;

public interface IProductService {

	List<Product> findAll();
	Product findById(Integer id);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Integer id);
	void addProduct(Product product);
	void UpdateProduct(Product product);
}
