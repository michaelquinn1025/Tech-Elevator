package com.techelevator.farm;

// public final class FarmAnimal would prevent inheriting from
// this class (this is because we made the class final)
public abstract class FarmAnimal {
	public static final String CAT = "cat";
	
	
	private String name;
	private String sound;
	private boolean asleep;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		this.asleep = false;
	}
	
	public FarmAnimal(String name, String sound, boolean asleep) {
		this.name = name;
		this.sound = sound;
		this.asleep = asleep;
	}

	public String getName() {
		return name;
	}

	// adding final to the method prevents any
	// subclasses from overriding it
	public final String getSound() {
		if (asleep) {
			return "Zzzzzz";
		}
		return sound;
	}
	
	public boolean isAsleep() {
		return asleep;
	}
	
	public void setAsleep(boolean asleep) {
		this.asleep = asleep;
	}
	
	public abstract void eat();

}