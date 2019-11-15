package com.billing.backend.dao;

import java.util.List;

import com.billing.backend.entity.Customer;

public interface CustomerDao {
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
