package com.billing.dto;

public class ResponseDto {
	
	private int responseCode;
	private String responseMessage;
	private Object data;
	
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseDto(int responseCode, String responseMessage, Object data) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.data = data;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", data=" + data
				+ "]";
	}
}
