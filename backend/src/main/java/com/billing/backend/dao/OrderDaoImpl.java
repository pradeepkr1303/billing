package com.billing.backend.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Order;
import com.billing.backend.repository.OrderRepository;

@Repository
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		Order savedOrder;
		savedOrder = orderRepository.save(order);
		return savedOrder;
	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> orders = new ArrayList<Order>();
		orderRepository.findAll().forEach(orders::add);
		return orders;
	}
}
