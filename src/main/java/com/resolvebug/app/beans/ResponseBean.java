package com.resolvebug.app.beans;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.resolvebug.app.common.StatusBean;

@Service("responseBean")
public class ResponseBean extends StatusBean {
	@JsonInclude(Include.NON_NULL)
	Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
