package com.billing.backend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Bill {
	
	@Id
	@GeneratedValue
	private Long billNo;
	
	private Date date;
	
	private Long customerId;
	
	private double taxableAmount;
	
	private double cgst;
	
	private double sgst;
	
	private double roundoff;
	
	private Long grandTotal;
	
	private String amountInWords;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date updatedDate;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Long billNo, Date date, Long customerId, double taxableAmount, double cgst, double sgst,
			double roundoff, Long grandTotal, String amountInWords, Date createdDate, Date updatedDate) {
		super();
		this.billNo = billNo;
		this.date = date;
		this.customerId = customerId;
		this.taxableAmount = taxableAmount;
		this.cgst = cgst;
		this.sgst = sgst;
		this.roundoff = roundoff;
		this.grandTotal = grandTotal;
		this.amountInWords = amountInWords;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "bill [billNo=" + billNo + ", date=" + date + ", customerId=" + customerId + ", taxableAmount="
				+ taxableAmount + ", cgst=" + cgst + ", sgst=" + sgst + ", roundoff=" + roundoff + ", grandTotal="
				+ grandTotal + ", amountInWords=" + amountInWords + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}

	public Long getBillNo() {
		return billNo;
	}

	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public double getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getRoundoff() {
		return roundoff;
	}

	public void setRoundoff(double roundoff) {
		this.roundoff = roundoff;
	}

	public Long getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Long grandTotal) {
		this.grandTotal = grandTotal;
	}

	public String getAmountInWords() {
		return amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
}
