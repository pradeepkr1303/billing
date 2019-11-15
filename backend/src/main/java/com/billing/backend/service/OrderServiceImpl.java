package com.billing.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.billing.backend.dao.OrderDao;
import com.billing.backend.entity.Order;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public Order saveOrder(Order order) {
		order.setCreatedDate(new Date());
		return orderDao.saveOrder(order);
	}

	@Override
	public List<Order> getAllOrders() {
		return orderDao.getAllOrders();
	}

}
