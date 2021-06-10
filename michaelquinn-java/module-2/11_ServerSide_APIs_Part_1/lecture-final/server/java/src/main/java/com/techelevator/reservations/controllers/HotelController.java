package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }
    
    
    /* use query param for id */
    // @RequestParam is required unless
    // 1) required=false is added to @RequestParam or 
    // 2) a defaultValue is specified [Note that defaultValue is ALWAYS a String regardless
    //	of what the param type in your method is... Spring will convert it to the right data type
    @RequestMapping(path = "/hotel", method = RequestMethod.GET)
    public Hotel get(@RequestParam(defaultValue="0") int id, @RequestParam(defaultValue="blah") String name) {
        return hotelDAO.get(id);
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    // Path params are surrounded by {} and map to the method param with the matching
    // name (i.e. {id} -> int id)
    // You don't have to speicfy the java params in same order as in path
    // (path param names are accessed by name, tahter than order - think Map)
    // The order of the params IN THE PATH does matter. If the #/types don't match
    // what's expected you will get a 400 BadRequest status code. 
    @RequestMapping(path = "/hotels/{id}/{name}", method = RequestMethod.GET)
    public Hotel getNew(@PathVariable int id, @PathVariable  String name) {
        return hotelDAO.get(id);
    }
    	
    @RequestMapping(path = "/hoteltest", method = RequestMethod.POST)
    public Hotel getHotel(@RequestBody Hotel hotel) {
    	System.out.println(hotel.getName());
    	return hotel;
    }
    
    // additional examples...
    
    // Example of using a different name in request query param and 
    // Java method name.
    // 
    // http://localhost:8080/nametest?testname=Yoav 
    // will get to this method and populate the name method
    // param with the value from the testname query param
    //
    // If you use name in the querty request it will cause
    // a 400 Bad Request response because the query param is not called testname
    //
    // i.e. http://localhost:8080/nametest?name=Yoav will fail because
    // param is callled name rather than testname
    @RequestMapping(path = "/nametest", method = RequestMethod.GET)
    public String printName(@RequestParam("testname") String name) {
    	return "Hello " + name;
    }
    
    // Additional info:
    // Springboot appears to default to ignore known fields as well as missing fields
    // which are not specified as required
    @RequestMapping(path = "/requestparamtest", method = RequestMethod.GET)
    public String paramTest(String name) {
    	return "Hello " + name;
    }
    
    /*
     * Note that use of @RequestParam is optional,
     * e.g. to set its attributes. By default any
     * argument that is a simple value type,
     * as determined by BeanUtils#isSimpleProperty,
     * and is not resolved by any other argument resolver,
     * is treated as if it was annotated with @RequestParam.
     */
    

}
