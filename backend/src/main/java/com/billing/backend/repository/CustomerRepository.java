package com.billing.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{}
