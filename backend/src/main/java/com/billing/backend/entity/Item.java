package com.billing.backend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@IdClass(ItemId.class)
public class Item {
	@Id
	private Long id;
	
	@Id
	private Long billNo;

	private String particular;
	
	private String hsnCode;
	
	private Double quantity;
	
	private String quantityUnit;
	
	private Double rate;
	
	private Double price;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date updatedDate;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Long id, Long billNo, String particular, String hsnCode, Double quantity, String quantityUnit,
			Double rate, Double price, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.billNo = billNo;
		this.particular = particular;
		this.hsnCode = hsnCode;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.rate = rate;
		this.price = price;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", billNo=" + billNo + ", particular=" + particular + ", hsnCode=" + hsnCode
				+ ", quantity=" + quantity + ", quantityUnit=" + quantityUnit + ", rate=" + rate + ", price=" + price
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillNo() {
		return billNo;
	}

	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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
