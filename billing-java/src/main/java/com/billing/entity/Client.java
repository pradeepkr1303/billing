package com.billing.entity;

import java.util.Date;

/*
 * Client class.
 */
public class Client {
	
	private int clientId;
	
	private String clientName;
	private String clientAddress;
	private String clientGstin;
	private String clientPhoneNumber;
	
	private Date clientCreatedDate;
	private Date clientUpdatedDate;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(int clientId, String clientName, String clientAddress, String clientGstin, String clientPhoneNumber,
			Date clientCreatedDate, Date clientUpdatedDate) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientGstin = clientGstin;
		this.clientPhoneNumber = clientPhoneNumber;
		this.clientCreatedDate = clientCreatedDate;
		this.clientUpdatedDate = clientUpdatedDate;
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getClientAddress() {
		return clientAddress;
	}


	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}


	public String getClientGstin() {
		return clientGstin;
	}


	public void setClientGstin(String clientGstin) {
		this.clientGstin = clientGstin;
	}


	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}


	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}


	public Date getClientCreatedDate() {
		return clientCreatedDate;
	}


	public void setClientCreatedDate(Date clientCreatedDate) {
		this.clientCreatedDate = clientCreatedDate;
	}


	public Date getClientUpdatedDate() {
		return clientUpdatedDate;
	}


	public void setClientUpdatedDate(Date clientUpdatedDate) {
		this.clientUpdatedDate = clientUpdatedDate;
	}


	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientAddress=" + clientAddress
				+ ", clientGstin=" + clientGstin + ", clientPhoneNumber=" + clientPhoneNumber + ", clientCreatedDate="
				+ clientCreatedDate + ", clientUpdatedDate=" + clientUpdatedDate + "]";
	}
	
	
}
