package com.resolvebug.app.response;

import org.springframework.beans.factory.annotation.Autowired;

import com.resolvebug.app.beans.Status;

public class ResponseObjectManager {

	@Autowired
	Status status;

	public Status getSuccessStatus() {
		status.setStatusCode("S0001");
		status.setStatusMsg("Success");
		return status;
	}

}
