package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {
		
		FarmAnimal cow = new Cow();
		FarmAnimal chicken = new Chicken();
		FarmAnimal cat = new Cat();
		
		String catName = FarmAnimal.CAT;

		chicken.setAsleep(true);
		cat.setAsleep(true);
		
		FarmAnimal[] farmAnimals = new FarmAnimal[] { cow, chicken, cat };
		
		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		/*
		// println adds return at end of String
		System.out.println("The cow eats: ");
		cow.eat();
		
		System.out.println();
		
		// prints with out a return so you can print something
		// else next to it
		System.out.print("The cow eats: ");
		cow.eat();
		*/
		
		
		for (FarmAnimal animal : farmAnimals) {
			System.out.print("The " + animal.getName() + " eats: ");
			animal.eat();
		}
		
//		FarmAnimal framAnimal = new FarmAnimal("animal", "dnfjfdgij");
		
	}
}