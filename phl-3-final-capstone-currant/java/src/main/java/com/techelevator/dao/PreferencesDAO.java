package com.techelevator.dao;
import java.util.List;
import com.techelevator.model.Preferences;

public interface PreferencesDAO {
	
	void delete(int foodId, int userId);
	
	List<Preferences> getChoiceOfFood();

    void save(int foodId, int userId);

    List<Preferences> getAllFoodPreferences();
	
}


