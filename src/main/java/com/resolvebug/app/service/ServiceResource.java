package com.resolvebug.app.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resolvebug.app.beans.LoginDetails;
import com.resolvebug.app.manager.ServiceManager;

@Service
@Path("/v1")
public class ServiceResource {

	@Autowired
	ServiceManager serviceManager;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/details/get")
	public Response getDetails(LoginDetails loginDetails) {
		LoginDetails details = serviceManager.getDetails(loginDetails);
		return Response.status(200).entity(details).build();
	}

}
