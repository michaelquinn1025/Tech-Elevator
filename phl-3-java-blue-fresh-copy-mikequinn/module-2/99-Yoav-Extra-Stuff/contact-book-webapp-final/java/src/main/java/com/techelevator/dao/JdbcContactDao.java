package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.domain.Contact;

@Component
public class JdbcContactDao implements ContactDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcContactDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Contact> listAllContacts() {
		List<Contact> contactList = new ArrayList<>();
		
		String sql = "SELECT id, first_name, last_name, phone, email, birthyear FROM contact";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);
		if (rowSet != null) {
			while(rowSet.next()) {
				Contact contact = getContactFromRowSet(rowSet);
				contactList.add(contact);
			}
		}
		return contactList;
	}
	
	@Override
	public Contact getContactById(Integer id) {
		String sql = "SELECT id, first_name, last_name, phone, email, birthyear FROM contact WHERE id=?";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, id);
		if (rowSet != null) {
			if (rowSet.next()) {
				return getContactFromRowSet(rowSet);
			}
		}
		return null;
	}

	@Override
	public Contact createContact(Contact contact) {
		String sql = "INSERT INTO contact (first_name, last_name, phone, email, birthyear) VALUES (?, ?, ?, ?, ?) "
				+ "RETURNING id";
		Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, contact.getFirstName(), contact.getLastName(),
				contact.getPhone(), contact.getEmail(), contact.getBirthYear());
		contact.setId(newId);
		return contact;
	}
	
	@Override
	public void updateContact(Integer id, Contact contact) {
		String sql = "UPDATE contact SET first_name=?, last_name=?, phone=?, email=?, birthyear=? WHERE "
				+ "id=?";
		int rowsUpdated = jdbcTemplate.update(sql, contact.getFirstName(), contact.getLastName(),
				contact.getPhone(), contact.getEmail(), contact.getBirthYear(), id);
		System.out.println("rowsUpdated: " + rowsUpdated);
	}

	
	// SqlRowSet will be pointing to the current row
	private Contact getContactFromRowSet(SqlRowSet row) {
		Contact contact = new Contact();
		contact.setId(row.getInt("id"));
		contact.setFirstName(row.getString("first_name"));
		contact.setLastName(row.getString("last_name"));
		contact.setPhone(row.getString("phone"));
		contact.setEmail(row.getString("email"));
		contact.setBirthYear(row.getInt("birthyear"));
		
		return contact;
	}

}
