package com.billing.backend.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Customer;
import com.billing.backend.repository.CustomerRepository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		System.out.println(customers);
		return customers;
	}

}
