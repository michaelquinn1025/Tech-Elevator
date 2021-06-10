package com.techelevator.farm;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!", true);
	}
	
	public void eat() {
		System.out.println("grass");
	}

}