package com.mindtree.customer.storecustomer.services;

import com.mindtree.customer.storecustomer.entity.customer;

public interface customerService {
	
	public customer findById(long id);
	public customer addCustomer(customer cust);

}
