package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
	private String name;
	private String species;
	List<String> vaccinations = new ArrayList<>();
	
	public Pet(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	

	public String getName () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.name = species;
	}
	
	public List<String> getVaccinations() {
		return vaccinations;
	}
	
	public void setVaccinations(List<String> vaccinations) {
		this.vaccinations = vaccinations;
	}
	
	public String listVaccinations() {
		String result = "";
		for (int i = 0; i < vaccinations.size(); i++) {
			result += vaccinations.get(i);
			if (i < vaccinations.size() - 1) {
				result += ", ";
			}
		}
		
		return result;
	}
	
	

}
