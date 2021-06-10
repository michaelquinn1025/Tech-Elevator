package com.techelevator.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.FavoritesDAO;
import com.techelevator.dao.PreferencesDAO;
import com.techelevator.dao.UserDAO;
import com.techelevator.model.Favorites;
import com.techelevator.model.Preferences;


@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class RestaurantController {

	private FavoritesDAO favoritesDAO;
	private PreferencesDAO preferencesDAO;
	
	public RestaurantController(UserDAO userDAO, FavoritesDAO favoritesDAO, PreferencesDAO preferencesDAO) {
		this.favoritesDAO = favoritesDAO;
        this.preferencesDAO = preferencesDAO;
    }
	
	@ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/users/{userId}/favorites", method = RequestMethod.GET)
    public List<Favorites> getAllFavorites(@PathVariable int userId) {
    	return favoritesDAO.getAllFavorites(userId);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/preferences", method = RequestMethod.GET)
    public List<Preferences> getAllFoodPreferences() {
    	return preferencesDAO.getAllFoodPreferences();
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/users/{userId}/favorites", method = RequestMethod.POST)
    public void addFavorites(@PathVariable int userId, @RequestBody Favorites favorites) {
    	System.out.println(favorites.getFavoriteName());
    	System.out.println(userId);
    	favoritesDAO.addFavorites(userId, favorites);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/users/{userId}/favorites/{favoriteId}", method = RequestMethod.DELETE)
    public void deleteFavorites(@PathVariable int userId, @PathVariable int favoriteId) {
        favoritesDAO.deleteFavorites(userId, favoriteId);
    }
}
