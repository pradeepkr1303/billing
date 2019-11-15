package com.billing.backend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Order {
	@Id
	@GeneratedValue
	private Long id;
	
	private Long billId;
	
	private String particular;
	
	private String hsnCode;
	
	private Double quantity;
	
	private String quantityUnit;
	
	private Double rate;
	
	private String rateUnit;
	
	private Double price;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date updatedDate;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long id, Long billId, String particular, String hsnCode, Double quantity, String quantityUnit,
			Double rate, String rateUnit, Double price, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.billId = billId;
		this.particular = particular;
		this.hsnCode = hsnCode;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.rate = rate;
		this.rateUnit = rateUnit;
		this.price = price;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", billId=" + billId + ", particular=" + particular + ", hsnCode=" + hsnCode
				+ ", quantity=" + quantity + ", quantityUnit=" + quantityUnit + ", rate=" + rate + ", rateUnit="
				+ rateUnit + ", price=" + price + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
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

	public String getRateUnit() {
		return rateUnit;
	}

	public void setRateUnit(String rateUnit) {
		this.rateUnit = rateUnit;
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
