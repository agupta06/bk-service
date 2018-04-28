package com.resolvebug.app.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resolvebug.app.beans.LoginDetails;
import com.resolvebug.app.beans.ResponseBean;
import com.resolvebug.app.common.Constants;
import com.resolvebug.app.common.Utilities;
import com.resolvebug.app.handler.ServiceHandler;

@Service
@Path("/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ServiceController {

	@Autowired
	ServiceHandler serviceManager;

	@POST
	@Path("/details/post")
	public ResponseBean postDetails(LoginDetails loginDetails) {
		LoginDetails details = serviceManager.postDetails(loginDetails);
		return Utilities.createResponseEntity(Constants.STATUS_CODE_SUCCESS, Constants.SUCCESS_MSG, details);
	}

	@GET
	@Path("/details/get")
	public ResponseBean getDetails() {
		LoginDetails details = serviceManager.getDetails();
		return Utilities.createResponseEntity(Constants.STATUS_CODE_SUCCESS, Constants.SUCCESS_MSG, details);
	}
}
