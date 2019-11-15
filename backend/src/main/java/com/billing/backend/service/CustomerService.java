package com.billing.backend.service;

import java.util.List;

import com.billing.backend.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAllCustomer();

}
