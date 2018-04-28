package com.resolvebug.app.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resolvebug.app.adapter.ServiceAdapter;
import com.resolvebug.app.beans.LoginDetails;

@Component
public class ServiceManager {
	@Autowired
	ServiceAdapter serviceAdapter;

	public LoginDetails getDetails(LoginDetails loginDetails) {
		return serviceAdapter.getDetails(loginDetails);
	}
}
