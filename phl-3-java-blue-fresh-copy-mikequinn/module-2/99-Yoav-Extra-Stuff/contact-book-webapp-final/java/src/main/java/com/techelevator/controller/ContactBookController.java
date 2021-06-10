package com.techelevator.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.ContactDao;
import com.techelevator.domain.Contact;

@RestController
@RequestMapping("/contacts")
public class ContactBookController {
	
	private ContactDao contactDao;
	
	public ContactBookController(ContactDao contactDao ) {
		this.contactDao = contactDao;
	}
	
	/*
	 * Create endpoints:
	 */
	
	
	// Get all Contacts
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Contact> getAllContacts() {
		List<Contact> result = contactDao.listAllContacts();
		return result;
	}
	

	// Get Contact by ID
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Contact getContactById(@PathVariable Integer id) {
		Contact contact = contactDao.getContactById(id);
		return contact;
	}
	
	
	// Create Contact
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "", method = RequestMethod.POST)
	public Contact createContact(@RequestBody Contact contact) {
		return contactDao.createContact(contact);
	}
	
	// Update Contact
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public void updateContact(@PathVariable Integer id, @Valid @RequestBody Contact contact) {
		contactDao.updateContact(id, contact);
	}
	
	
	// Delete Contact
	

}
