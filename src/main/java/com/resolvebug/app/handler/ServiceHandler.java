package com.resolvebug.app.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resolvebug.app.beans.LoginDetails;
import com.resolvebug.app.validator.ServiceValidator;

@Component
public class ServiceHandler {
	@Autowired
	ServiceValidator serviceAdapter;

	public LoginDetails postDetails(LoginDetails loginDetails) {
		return serviceAdapter.postDetails(loginDetails);
	}

	public LoginDetails getDetails() {
		return serviceAdapter.getDetails();
	}
}
