package com.medonline.dao.hibernate;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.medonline.dao.OrderDao;
import com.medonline.model.Order;

public class OrderDaoImpl extends HibernateDaoSupport  implements OrderDao {

	@Override
	@Transactional
	public boolean saveOrder(Order o) {
	getHibernateTemplate().save(o);
		return false;
	}

}
