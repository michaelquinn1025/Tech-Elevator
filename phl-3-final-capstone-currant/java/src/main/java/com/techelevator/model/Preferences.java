package com.techelevator.model;

public class Preferences {
	
	private int foodId;
	private String foodName;
	private int userId;
	
	public Preferences(int foodId) {
		this.foodId = foodId;
	}
	
	public Preferences() {
		
	}
	
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	

}
