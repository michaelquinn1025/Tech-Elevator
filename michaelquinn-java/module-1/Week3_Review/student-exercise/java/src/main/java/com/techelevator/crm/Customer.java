package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techelevator.Billable;
import com.techelevator.Person;
import com.techelevator.Pet;

public class Customer extends Person implements Billable {
	
	private String phoneNumber;
	private List<Pet> pets = new ArrayList<>();
	
	public Customer(String firstName, String lastName, String phoneNumber) {
		super(firstName, lastName);
		this.phoneNumber = phoneNumber;
	}
	
	public Customer(String firstName, String lastName) {
		this(firstName, lastName, "");
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public List<Pet> getPets() {
		return pets;
	}
	
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	@Override
	public double getBalanceDue(Map<String, Double> servicesRendered) {
		double balance = 0.0;
		
		if (servicesRendered != null) {
		for (String key : servicesRendered.keySet()) {
			Double cost = servicesRendered.get(key);
			if (cost != null) {
				balance += cost;
			}
		}
		}
		return balance;
	}
	
	
	
	
		
		
	

}
