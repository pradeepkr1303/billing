package com.billing.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.billing.backend.dao.BillDao;
import com.billing.backend.entity.Bill;

public class BillServiceImpl implements BillService {
	@Autowired
	private BillDao billDao;

	@Override
	public Bill saveBill(Bill bill) {
		bill.setCreatedDate(new Date());
		return billDao.saveBill(bill);
	}

	@Override
	public List<Bill> getAllBills() {
		return billDao.getAllBills();
	}
	
	
}
