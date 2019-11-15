package com.billing.backend.dao;

import java.util.List;

import com.billing.backend.entity.Order;

public interface OrderDao {
	public Order saveOrder(Order order);
	public List<Order> getAllOrders();

}
