package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    // Constructor is initialized with API's base URL
    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    // Ask the API for an array of Hotels by using GET localhost:3000/hotels
    public Hotel[] listHotels() {
    																//Hotel[] is the type to map JSON to
    	Hotel[] result = restTemplate.getForObject(API_BASE_URL + "hotels" , Hotel[].class);
        return result;
    }

    // Ask the API for an array of Review by using GET localhost:3000/reviews
    public Review[] listReviews() {									//Review[] is the type to map JSON to
    	Review [] result = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
        return result;
    }

    // Ask the API for a specific Hotel by using GET localhost:3000/hotels/{id} where {id} is the Hotel id
    // i.e. localhost:3000/hotels/3
    public Hotel getHotelById(int id) {
    	String url = API_BASE_URL + "hotels/" + id;
    											//Hotel is the type to map JSON to
    	Hotel result = restTemplate.getForObject(url, Hotel.class);
        return result;
    }

    // Ask the API for the reviews for a specific Hotel by using 
    // GET localhost:3000/hotels/{id}/reviews where {id} is the Hotel id
    // i.e. localhost:3000/hotels/3/reviews
    public Review[] getReviewsByHotelId(int hotelID) {
    	String url = API_BASE_URL + "hotels/" + hotelID + "/reviews";
    												//Review[] is the type to map JSON to	
    	Review[] result = restTemplate.getForObject(url, Review[].class);
        return result;
    }

    // Search for Hotel by number of stars by adding a query param
    // i.e. localhost:3000/hotels?stars=3
    public Hotel[] getHotelsByStarRating(int stars) {
    	String url = API_BASE_URL + "hotels?stars=" + stars;
    												//Hotel is the type to map JSON to
    	Hotel[] result = restTemplate.getForObject(url, Hotel[].class);
        return result;
    }

    public City getWithCustomQuery(){
        return null;
    }

}
