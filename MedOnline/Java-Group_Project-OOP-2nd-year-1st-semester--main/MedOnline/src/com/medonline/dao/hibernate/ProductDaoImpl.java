package com.medonline.dao.hibernate;


import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medonline.dao.OrderDao;
import com.medonline.dao.ProductDao;
import com.medonline.model.Order;
import com.medonline.model.OrderDetails;
import com.medonline.model.Product;

@Repository("ProductDao")
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{

	@Override
	@Transactional
	public boolean addProducct(Product product) {
		
		if(getHibernateTemplate().save(product)==null)
		return false;
		else 
			return true;
	}

	@Override
	public Product getProductByName() {
	
		
		return null;
	}

	@Override
	public List<Product> searchProduct(Product product) {
		
		return (List<Product>) getHibernateTemplate().find("from Product where name like ?", "%"+product.getName()+"%");
		
	
	}

	@Override
	public List<Product> getProductList() {
		
		return (List<Product>) getHibernateTemplate().find("from Product", null);
		
	}
	public static void main(String arg[])
	{
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("Beans.xml");
		
		((ProductDao) appContext.getBean("ProductDao")).addProducct(new Product(0, "test", "ddddddfs", 100, new Date(), new Date()));
		
		Product p=new Product();
		p.setName("pest");
		List<Product> prodList=((ProductDao) appContext.getBean("ProductDao")).searchProduct(p);
		System.out.println(prodList.get(0));
	}

	

}
