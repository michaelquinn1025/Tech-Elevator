package com.techelevator.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.domain.Contact;

public class JdbcContactDao implements ContactDao {
	
	private JdbcTemplate jdbcTemplate;
	
	// the constructor takes a datasource and
	// and creates a JdbcTemplate instance for the
	// JdbcContactDao instance to use
	public JdbcContactDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Contact getContactById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void printSomething() {
		
	}
	

}
