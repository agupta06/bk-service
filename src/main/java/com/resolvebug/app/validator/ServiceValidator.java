package com.resolvebug.app.validator;

import org.springframework.stereotype.Component;

import com.resolvebug.app.beans.LoginDetails;

@Component
public class ServiceValidator {

	public LoginDetails postDetails(LoginDetails loginDetails) {
		LoginDetails details = new LoginDetails();
		details.setName("Aish");
		return details;
	}

	public LoginDetails getDetails() {
		LoginDetails details = new LoginDetails();
		details.setName("Aish");
		return details;
	}
}
