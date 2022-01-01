package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	CustomerRepo cr;
	
	public void savecustomer(User u)
	{
		cr.save(u);
	}
	public User getCustomer(String email) {
		return cr.findByEmail(email);
	}
	
	
}
