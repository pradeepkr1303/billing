package com.billing.backend.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Bill;
import com.billing.backend.repository.BillRepository;

@Repository
public class BillDaoImpl implements BillDao {
	
	@Autowired
	BillRepository billRepository;

	@Override
	public Bill saveBill(Bill bill) {
		return billRepository.save(bill);
	}

	@Override
	public List<Bill> getAllBills() {
		List<Bill> bills = new ArrayList<>();
		billRepository.findAll().forEach(bills::add);
		return bills;
	}

	@Override
	public Long getBillCount() {
		return billRepository.count();
	}

	
}
