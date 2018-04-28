package com.resolvebug.app.adapter;

import org.springframework.stereotype.Component;

import com.resolvebug.app.beans.LoginDetails;

@Component
public class ServiceAdapter {

	public LoginDetails getDetails(LoginDetails loginDetails) {
		LoginDetails details = new LoginDetails();
		details.setName("Aish");
		return details;
	}

}
