package com.techelevator.dao;
import java.util.List;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.Preferences;

@Service
public class PreferencesJDBCDAO implements PreferencesDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public PreferencesJDBCDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void delete(int foodId, int userId) {

	}

	@Override
	public List<Preferences> getAllFoodPreferences() {
		List<Preferences> preferences = new ArrayList<>();
		String sql = "SELECT * FROM preferences";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			Preferences preference = mapRowToPreference(results);
			preferences.add(preference);
		}

		return preferences;

	}
	
	@Override
	public List<Preferences> getChoiceOfFood() {
		List<Preferences> preferences = new ArrayList<>();
		String sql = "SELECT * FROM preferences";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			Preferences preference = mapRowToPreference(results);
			preferences.add(preference);
		}

		return preferences;
	}

	@Override
	public void save(int foodId, int userId) {

	}

	private Preferences mapRowToPreference(SqlRowSet rs) {
		Preferences preferences = new Preferences();
		preferences.setFoodName(rs.getString("food_name"));
		preferences.setFoodId(rs.getInt("food_id"));
		return preferences;
	}

}


