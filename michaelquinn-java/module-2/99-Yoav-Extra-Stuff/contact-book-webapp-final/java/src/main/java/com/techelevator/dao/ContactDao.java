package com.techelevator.dao;

import java.util.List;

import com.techelevator.domain.Contact;

public interface ContactDao {

	// create a Contact
	Contact createContact(Contact contact);

	// get a contact by id
	Contact getContactById(Integer id);

	// get a List of all Contacts
	List<Contact> listAllContacts();

	// update a Contact
	void updateContact(Integer id, Contact contact);

	// delete Contact

}
