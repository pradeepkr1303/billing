package com.billing.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.backend.dao.CustomerDao;
import com.billing.backend.entity.Customer;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;

	public Customer saveCustomer(Customer customer) {
		
		//customer.setCreatedDate(new Date());
		customer.setCreatedDate(new Date());
		return customerDao.saveCustomer(customer);
	}

	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();
	}
}
