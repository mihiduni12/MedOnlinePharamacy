package com.medonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medonline.dao.ProductDao;
import com.medonline.model.Product;

@RestController
public class ProductService {
	@Autowired
	private ProductDao productDao;
@RequestMapping(value="{name}", method = RequestMethod.GET)
public @ResponseBody List<Product> getProductsByName(@PathVariable String name)
{
	
	return productDao.getProductList();
	
}


@RequestMapping("/product/list")
public @ResponseBody List<Product> getProductsList()
{
	
	return productDao.getProductList();
	
}
}
