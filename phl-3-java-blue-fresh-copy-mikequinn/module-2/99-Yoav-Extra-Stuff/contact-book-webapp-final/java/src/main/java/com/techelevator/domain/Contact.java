package com.techelevator.domain;

import javax.validation.constraints.NotBlank;

public class Contact {
	
	/**
	 * Validation Rules:
	 * 
	 * 1) firstName, lastName, phone, email cannot be blank
	 * 2)_birthyear cannot be null and must not be less than 1900
	 */
	
	private Integer id;
	
	@NotBlank(message = "firstName is required.")
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	private String email;
	
	private Integer birthYear;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "id: " + id + " firstName: " + firstName + " lastName: " + lastName
		+ " phone: " + phone + " email: " + email + " birth year: " + birthYear;
	}

}
