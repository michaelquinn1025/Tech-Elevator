package com.techelevator.auctions.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	@Autowired
    private AuctionDAO dao;

    public AuctionController(AuctionDAO dao) {
        this.dao = dao;
    }

    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {

        if( !title_like.equals("") ) {
            return dao.searchByTitle(title_like);
        }
        if(currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        }

        return dao.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) throws AuctionNotFoundException {
        return dao.get(id);
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping( path = "/auctions/{id}", method = RequestMethod.POST)
    public Auction  create(@Valid @RequestBody Auction auction) {
        return dao.create(auction);
    }
    
    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "resource deleted")
    public void deleteReservation(@PathVariable("id") int auctionId) throws AuctionNotFoundException {
    	dao.delete(auctionId);
    }
    
    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.PUT)
    public Auction updateAuction(@Valid @RequestBody Auction auction,
    		@PathVariable int id) throws AuctionNotFoundException {
    	return dao.update(auction, id);
    }
    
    
    
    }




