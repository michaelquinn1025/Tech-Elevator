package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
    	
    	List<Auction> auctions = new ArrayList<Auction>();

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");
        auctions.add(generalAuction);

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 70));
        generalAuction.placeBid(new Bid("Gritty", 19));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        System.out.println("generalAuction high bid: " + generalAuction.getHighBid().getBidder());
        
     // Create a new reserve auction
        System.out.println();
        System.out.println("Starting a reserve auction");
        System.out.println("-----------------");
        
        Auction reserveAuction = new ReserveAuction("Reserve It", 200);
        auctions.add(reserveAuction);
        
        // isReserveWinner not being used, just here to show what is returned 
        boolean isReserveWinner = false;
        isReserveWinner = reserveAuction.placeBid(new Bid("Reserve Bid 1", 75));
        isReserveWinner = reserveAuction.placeBid(new Bid("Reserve Bid 2", 100));
        // reserve not met at 150 so auction will not have a high bid.
        // change the bid below to something abouve 200 to see the the reserve amoutn get met
        isReserveWinner = reserveAuction.placeBid(new Bid("Reserve Bid 3", 150));
        System.out.println("reserveAuction high bid: " + reserveAuction.getHighBid().getBidder());
        
     // Create a new reserve auction
        System.out.println();
        System.out.println("Starting a buyout auction");
        System.out.println("-----------------");
        
        Auction buyoutAuction = new BuyoutAuction("Buy it now!", 300);
        auctions.add(buyoutAuction);
        
        buyoutAuction.placeBid(new Bid("Buyout bid 1", 100));
        buyoutAuction.placeBid(new Bid("Buyout bid 2", 200));
        buyoutAuction.placeBid(new Bid("Buyout bid 3", 325));
        // buyout auction amount (300) has been met so this bid won;t get placed
        buyoutAuction.placeBid(new Bid("Buyout bid 4", 400));
        System.out.println("buyoutAuction high bid: " + buyoutAuction.getHighBid().getBidder());
        
        // Because all our auction types are considered an Auction, we can loop through the
        // whole list of auctions and access the correct method for that auction to get the info we
        // we need. They are different, but the available Auction methods are the same
        for (Auction auction : auctions) {
        	System.out.println("Winner of auction" + auction.getItemForSale() + " is "
        			+ auction.getHighBid().getBidder());
        }
        
        
        // let's look at one other sceanrio
        Auction showDummyIssue = new BuyoutAuction("Buy it again!", 300);
        
        // Because we are treating showDummyIssue as an Auction, we can't
        // access any additonal functionality in  BuyoutAuction that isn't available
        // to Auction
        
        // if you uncommdent the line below the compiler will complain
        // because Auction does not have a dummyMethod.
        //showDummyIssue.dummyMethod();
        
        // We can cast an Auction back to its more specific type to
        // access additional functionality. Note that you have to enclose 
        // the variable and the cast in ( ) in order for the code
        // to know it has a dummyMethod
        ((BuyoutAuction)showDummyIssue).dummyMethod();
    }
}
