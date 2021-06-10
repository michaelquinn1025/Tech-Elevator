package com.techelevator.farm;

public class FarmAnimal implements Singable, Sellable {
	private String name;
	private String sound;
	
	//adding for selling
	private int price;

	public FarmAnimal(String name, String sound) {
		// must call any other constructor before anything else in constructor
//		this(name, sound, 0);
		this.name = name;
		this.sound = sound;
	}
	
	public FarmAnimal(String name, String sound, int price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}
	
	public int getPrice() {
		return price;
	}

}