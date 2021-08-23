package com.mindtree.customer.storecustomer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.customer.storecustomer.entity.customer;
import com.mindtree.customer.storecustomer.services.customerServiceImpl;

@RestController
public class customerController {

	@Autowired
	private customerServiceImpl service;
	
	@GetMapping(path = "/customer/{id}")
	public customer retieveById(@PathVariable long id) {
		return service.findById(id);
	}
	
	@PostMapping(path = "/customer")
	public customer addCustomer(@RequestBody customer cust) {
		return service.addCustomer(cust);
	}
	
}
