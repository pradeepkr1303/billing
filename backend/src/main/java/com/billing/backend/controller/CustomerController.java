package com.billing.backend.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.backend.dto.ResponseDto;
import com.billing.backend.entity.Customer;
//import com.billing.backend.repository.CustomerRepository;
import com.billing.backend.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	
	@Autowired
	private CustomerService customerService;
	
	private ResponseDto responseDto = new ResponseDto();

	@PostMapping("/saveCustomer")
	@CrossOrigin(origins = "http://localhost:4200")
	public final ResponseDto saveCustomer(@RequestBody Customer customer) {
		
//		System.out.println("Inside saveCustomer() controller");
		
		Customer customerSaved = customerService.saveCustomer(customer);
		
//		System.out.println("After customer saved");
		
		try {
//			System.out.println("inside try");
			if (customerSaved != null) {
//				System.out.println("inside if");
				responseDto.setResponseCode(HttpStatus.OK);
//				System.out.println("code done");
				responseDto.setResponseMessage("Customer " + customerSaved.getName() + " saved Successfully");
//				System.out.println("message done");
				responseDto.setData(customerSaved);
//				System.out.println("data done");
			} else {
//				System.out.println("inside else");
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
//				System.out.println("code done");
				responseDto.setResponseMessage("Customer " + customer.getName() + "not saved Successfully");
//				System.out.println("message done");
				responseDto.setData(customerSaved);
//				System.out.println("data done");
			}
		} catch (Exception e) {
//			System.out.println("inside catch");
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
//			System.out.println("code done");
			responseDto.setResponseMessage("Internal server error");
//			System.out.println("message done");
			responseDto.setData(e);
//			System.out.println("data done");
		}
//		System.out.println("outside try");
		return responseDto;
	}
	
	@GetMapping("/allCustomers")
	@CrossOrigin(origins = "http://localhost:4200")
	public final ResponseDto getAllCustomer() {
		
		System.out.println("Inside getAllCustomer() controller");
		
		List<Customer> customers = customerService.getAllCustomer();
		
		try {
			if(customers != null && customers.size() > 0) {
				responseDto.setResponseCode(HttpStatus.OK);
				responseDto.setResponseMessage("All customer details fetched successfully");
				responseDto.setData(customers);
			} else {
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
				responseDto.setResponseMessage("Error in fetching all customer details");
				responseDto.setData(customers);
			}
		} catch (Exception e) {
			System.out.println("Exception in getAllCustomer() controller");
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
			responseDto.setResponseMessage("Exception in getAllCustomer() controller");
			responseDto.setData(e);
		}
		
		return responseDto;
	}
	
	/*
	 * Testing purpose
	 * Don't delete
	 */
	
//	@Autowired
//	private CustomerRepository customerRepository;

//	@GetMapping("/check")
//	public final String check() {
//		return "Working Pradeep!!";
//	}
//	
//	@GetMapping("/checkagain")
//	public final String checkagain() {
//		return "Working Pradeep!!!!";
//	}
//	
//	@GetMapping("/date")
//	public String todayDate() {
//		java.util.Date javaDate = new java.util.Date();
//		java.sql.Date sqlDate = new java.sql.Date(0);
//		return javaDate + " java <--> sql " + sqlDate;
//	}
//	
//	@GetMapping("/checkCustomer")
//	public Customer checkCustomer() {
//		Customer customer = new Customer();
//		customer.setAddress("5/1041, 2A");
//		customer.setCreatedDate(new java.util.Date());
//		customer.setGstin("AYCPG8601J");
//		customer.setName("Pradeep kumar G");
//		customer.setPhoneNumber("+919443079510");
//		return customer;
//	}
//	
//	@PostMapping("/saveCustomerFromBody")
//	public Customer checkCustomerFromBody(@RequestBody Customer customer) {
//		customerRepository.save(customer);
//		return customer;
//	}
//	
//	@PostMapping("/saveCustomerFromController")
//	public Customer saveCustomer() {
//		Customer customer = new Customer();
//		customer.setAddress("5/1041, 2A");
//		customer.setCreatedDate(new java.util.Date());
//		customer.setGstin("AYCPG8601J");
//		customer.setName("Pradeep kumar G");
//		customer.setPhoneNumber("+919443079510");
//		
//		customerRepository.save(customer);
//		
//		return customer;
//	}
//	
//	@GetMapping("/getAllCustomersFromController")
//	public List<Customer> getAllCustomers() {
//		List<Customer> customers = new ArrayList<>();
//		customerRepository.findAll().forEach(customers::add);
//		return customers;
//	}
}
