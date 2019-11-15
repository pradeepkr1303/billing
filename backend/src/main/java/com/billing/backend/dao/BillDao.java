package com.billing.backend.dao;

import java.util.List;

import com.billing.backend.entity.Bill;

public interface BillDao {
	public Bill saveBill(Bill bill);
	public List<Bill> getAllBills();

}
