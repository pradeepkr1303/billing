package com.billing.backend.service;

import java.util.List;

import com.billing.backend.entity.Order;

public interface OrderService {
	public Order saveOrder(Order order);
	public List<Order> getAllOrders();
}
