package com.techelevator.farm;

public class Cat extends FarmAnimal {

	public Cat() {
		super(FarmAnimal.CAT, "meow!");
	}

	@Override
	public void eat() {
		System.out.println("Fancy Feast");
	}
	
	
}
