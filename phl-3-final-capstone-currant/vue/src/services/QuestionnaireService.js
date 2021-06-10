import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080/"
});


export default {

    getFoods() {
        return http.get('preferences');
    },

    getAllFavorites(userId) {
        return http.get(`users/${userId}/favorites`);
    },

    searchRandomZip(zip) {
        return http.get(`/pull/${zip}`);
    },

    saveFavorite(userId, favorite) {
        return http.post(`users/${userId}/favorites`, {

            favoriteName: favorite.name,
            favoriteId: favorite.id,
            food: favorite.food,
            phoneNumber: favorite.phone_numbers,
            ratings: favorite.user_rating.aggregate_rating,
            description: favorite.description,
            image: favorite.featured_image,
            currency: favorite.currency,
            menuUrl: favorite.menu_url,
            url: favorite.url

        });
    },

    deleteFavorite(userId, favoriteId) {
        return http.delete(`users/${userId}/favorites/${favoriteId}`);
    }
}