package com.billing.backend.service;

import java.util.List;

import com.billing.backend.entity.Bill;

public interface BillService {
	public Bill saveBill(Bill bill);
	public List<Bill> getAllBills();

}
