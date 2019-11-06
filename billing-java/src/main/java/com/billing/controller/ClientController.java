package com.billing.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.billing.dto.ResponseDto;

@Path("/client")
public class ClientController {
	@POST
	@Path("/saveClient")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public final ResponseDto saveClient() {
		
		return new ResponseDto();
	}
}
