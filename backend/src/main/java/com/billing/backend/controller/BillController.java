package com.billing.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.backend.dto.ResponseDto;
import com.billing.backend.entity.Bill;
import com.billing.backend.service.BillService;

@RestController
@RequestMapping("/bill")
@CrossOrigin
public class BillController {
	
	@Autowired
	private ResponseDto responseDto;
	
	@Autowired
	private BillService billService;
	
	@GetMapping("/getAllBills")
	public ResponseDto getallBills() {
		List<Bill> bills = new ArrayList<>();
		bills = billService.getAllBills();
		
		try {
			if(bills != null && bills.size() > 0) {
				responseDto.setResponseCode(HttpStatus.OK);
				responseDto.setResponseMessage("Total Bills : " + bills.size());
				responseDto.setData(bills);
			} else {
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
				responseDto.setResponseMessage("No Bills available");
				responseDto.setData(bills);
			}
		} catch (Exception e) {
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
			responseDto.setResponseMessage("Internal Server error");
			responseDto.setData(e);
		}
		
		return responseDto;
	}
	
	@PostMapping("/saveBill")
	public ResponseDto saveBill(@RequestBody Bill bill) {
		Bill billSaved = new Bill();
		billSaved = billService.saveBill(bill);
		
		try {
			if(billSaved != null) {
				responseDto.setResponseCode(HttpStatus.OK);
				responseDto.setResponseMessage("Bill saved successfully with the ID: " + bill.getBillNo());
				responseDto.setData(billSaved);
			} else {
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
				responseDto.setResponseMessage("Error in saving bill");
				responseDto.setData(bill);
			}
		} catch (Exception e) {
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
			responseDto.setResponseMessage("Internal Server error");
			responseDto.setData(e);
		}
		
		return responseDto;
	}
	
	@GetMapping("getBillCount")
	public ResponseDto getBillCount() {
		
		Long billCount = billService.getBillCount();
		
		try {
			if(billCount != null) {
				responseDto.setResponseCode(HttpStatus.OK);
				responseDto.setResponseMessage("Total Bills: " + billCount);
				responseDto.setData(billCount);
			} else {
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
				responseDto.setResponseMessage("Error in getting bill count");
				responseDto.setData(billCount);
			}
		} catch (Exception e) {
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
			responseDto.setResponseMessage("Internal Server error");
			responseDto.setData(e);
		}
		
		return responseDto;
	}
}
