package com.mindtree.customer.storecustomer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.customer.storecustomer.Dao.customerDao;
import com.mindtree.customer.storecustomer.entity.customer;

@Component
public class customerServiceImpl {
	
	@Autowired
	private customerDao CustomerDao;
	
	public customer findById(long id) {
		return CustomerDao.findById(id).get();
	}
	
	public customer addCustomer(customer cust) {
		return CustomerDao.save(cust);
	}

}
