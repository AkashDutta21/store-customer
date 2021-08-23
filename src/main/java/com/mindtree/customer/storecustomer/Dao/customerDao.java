package com.mindtree.customer.storecustomer.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mindtree.customer.storecustomer.entity.customer;

@Component
public interface customerDao extends JpaRepository<customer, Long> {

}
