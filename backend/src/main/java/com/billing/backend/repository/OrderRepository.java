package com.billing.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{

}
