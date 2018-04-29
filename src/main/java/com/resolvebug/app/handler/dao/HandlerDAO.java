package com.resolvebug.app.handler.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.resolvebug.app.beans.LoginDetails;

public class HandlerDAO {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@SuppressWarnings("unchecked")
	public void print(LoginDetails loginDetails) {

		List<String> actual = template.queryForList("select name from transaction_details", String.class);
		System.out.println(actual);

		/*
		 * String sqlQuery = "select name from transaction_details"; String
		 * employeeEmail = template.queryForObject(sqlQuery, String.class).toString();
		 * System.out.println(employeeEmail);
		 */

		String sqlQuery1 = "insert into transaction_details(NAME) values (?)";
		Object[] inputs = new Object[] { loginDetails.getName() };
		int rowsAffected = this.template.update(sqlQuery1, inputs);
	}

}
