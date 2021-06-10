package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Favorites;

public interface FavoritesDAO {

    List<Favorites> getAllFavorites(int userId);
    
    void addFavorites(int userId, Favorites favorites);

    void deleteFavorites(int userId, int favoriteId);

    boolean isInFavorites(Favorites favorites);

    boolean isInUserFavorites(int userId, Favorites favorites);
}
