package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcContactDao implements ContactDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcContactDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
