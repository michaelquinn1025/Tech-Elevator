package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.Favorites;

@Service
public class FavoritesJDBCDAO implements FavoritesDAO{

	private JdbcTemplate jdbcTemplate;

	public FavoritesJDBCDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean isInFavorites(Favorites favorites) {

	    String sql = "SELECT COUNT(*) FROM favorites WHERE favorite_api_id = ?";
	    int count = jdbcTemplate.queryForObject(sql, new Object[] {favorites.getFavoriteId()}, Integer.class);
	    return count > 0;
    }

    @Override
	public boolean isInUserFavorites(int userId, Favorites favorites) {

		String sql = "SELECT COUNT(*) FROM user_favorites WHERE user_id = ? AND favorite_api_id = ?";
		int count = jdbcTemplate.queryForObject(sql, new Object[] {userId, favorites.getFavoriteId()}, Integer.class);
		return count > 0;

	}

	@Override
	public void addFavorites(int userId, Favorites favorites) {

	    if (!isInFavorites(favorites)) {
			String insertFavorite = "INSERT INTO favorites(favorite_api_id, favorite_name, food, phone_number, ratings, description, image, currency, url, menu_url) "
								  + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(insertFavorite, favorites.getFavoriteId(), favorites.getFavoriteName(),
				favorites.getFood(), favorites.getPhoneNumber(), favorites.getRatings(), favorites.getDescription(),
				favorites.getImage(), favorites.getCurrency(), favorites.getUrl(), favorites.getMenuUrl());
        }

	    if (!isInUserFavorites(userId, favorites)) {
			String insertUserIdAndFavorite = "INSERT INTO user_favorites (user_id, favorite_api_id) VALUES (?, ?)";
			jdbcTemplate.update(insertUserIdAndFavorite, userId, favorites.getFavoriteName());
		}

	}

	@Override
	public void deleteFavorites(int userId, int favoriteId) {
		String deleteUserIdAndFavorite = "DELETE FROM user_favorites WHERE user_id = ? AND favorite_api_id = ?";
		jdbcTemplate.update(deleteUserIdAndFavorite, userId, favoriteId);
	}

	@Override
	public List<Favorites> getAllFavorites(int userId) {
		List<Favorites> favorites = new ArrayList<>();
		String sql = "SELECT *" + " FROM favorites INNER JOIN user_favorites ON favorites.favorite_api_id"
				+ " = user_favorites.favorite_api_id WHERE user_id = ?";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
		while (results.next()) {
			Favorites favorite = mapRowToFavorite(results);
			favorites.add(favorite);
		}

		return favorites;
	}

	private Favorites mapRowToFavorite(SqlRowSet rs) {
		Favorites favorite = new Favorites();
		favorite.setFavoriteId(rs.getInt("favorite_api_id"));
		favorite.setFavoriteName(rs.getString("favorite_name"));
		favorite.setFood(rs.getString("cuisine"));
		favorite.setPhoneNumber(rs.getString("phone_number"));
		favorite.setRatings(rs.getString("ratings"));
		favorite.setDescription(rs.getString("description"));
		favorite.setImage(rs.getString("featured_image"));
		favorite.setCurrency(rs.getString("currency"));
		favorite.setMenuUrl(rs.getString("menu_url"));
		favorite.setUrl(rs.getString("url"));
		return favorite;
	}
}
