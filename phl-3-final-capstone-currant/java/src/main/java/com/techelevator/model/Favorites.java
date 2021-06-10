package com.techelevator.model;

import java.util.Objects;

public class Favorites {

	private int favoriteId;
    private String favoriteName;
    private String food;
    private String phoneNumber;
    private String ratings;
    private String description;
    private String image;
    private String currency;
    private String url;
    private String menuUrl;
    
    public Favorites() {
    	
    }
    
    public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getFavoriteName() {
        return favoriteName;
    }

    public void setFavoriteName(String favoriteName) {
        this.favoriteName = favoriteName;
    }
    public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Favorites favorite = (Favorites) o;
		return Objects.equals(getFavoriteId(), favorite.getFavoriteId()) &&
				Objects.equals(getFavoriteName(), favorite.getFavoriteName()) &&
				Objects.equals(getFood(), favorite.getFood()) &&
				Objects.equals(getPhoneNumber(), favorite.getPhoneNumber()) &&
				Objects.equals(getRatings(), favorite.getRatings()) &&
				Objects.equals(getDescription(), favorite.getDescription()) &&
				Objects.equals(getImage(), favorite.getImage()) &&
				Objects.equals(getCurrency(), favorite.getCurrency()) &&
				Objects.equals(getMenuUrl(), favorite.getMenuUrl()) &&
				Objects.equals(getUrl(), favorite.getUrl());
	}
	
}
