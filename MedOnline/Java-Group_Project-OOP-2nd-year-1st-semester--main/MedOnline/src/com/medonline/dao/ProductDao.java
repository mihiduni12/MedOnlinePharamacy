package com.medonline.dao;

import java.util.List;

import com.medonline.model.Product;

public interface ProductDao {

	public boolean addProducct(Product product);
	public Product getProductByName();
	public List<Product> searchProduct(Product product);
	public List<Product> getProductList();
}
