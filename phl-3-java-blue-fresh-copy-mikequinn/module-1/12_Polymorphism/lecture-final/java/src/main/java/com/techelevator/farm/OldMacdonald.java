package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		//FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken() };
		
		Singable[] singingThings = new Singable[] { new Cow(), new Chicken(), new Tractor() };

		//for (FarmAnimal animal : farmAnimals) {
		for (Singable singingThing : singingThings) {
//			String name = animal.getName();
			String name = singingThing.getName();
//			String sound = animal.getSound();
			String sound = singingThing.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		Sellable[] sellableThings = { new Cow(), new Chicken(), new Egg()  };
		for (Sellable item : sellableThings) {
			System.out.println(item.getName() + ": $" + item.getPrice());
		}
		
	}
}