package com.billing.backend.dto;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ResponseDto {
	
	private HttpStatus responseCode;
	private String responseMessage;
	private Object data;
	
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseDto(HttpStatus responseCode, String responseMessage, Object data) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", data=" + data
				+ "]";
	}

	public HttpStatus getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(HttpStatus responseCode) {
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

	
}
