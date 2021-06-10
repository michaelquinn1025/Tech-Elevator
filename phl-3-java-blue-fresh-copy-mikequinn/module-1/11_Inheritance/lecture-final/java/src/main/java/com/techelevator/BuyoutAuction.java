package com.techelevator;

/**
 * This class models an auction with an additional set price (the 'buyout' price) that any bidder
 * can accept at any time during the auction, thereby immediately ending the auction and winning
 * the item.  If no bidder chooses to utilize the buyout option before the end of bidding the
 * highest bidder wins.
 */
public class BuyoutAuction extends Auction {
	
	int buyoutAmount;
	
	public BuyoutAuction(String itemForSale, int buyoutAmount) {
		// must call Auction constructor
		super(itemForSale);
		this.buyoutAmount = buyoutAmount;
	}
	
	/*
	 * This class overrides the default placeBid behavior of the parent class.
	 * If the current high bid is above the buyout amout , the bid
	 * is ignored.
	 */
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isBuyoutWinningBid = false;
		
		// if we leave currentHighBid in Auction as private we need to use 
		// the getter to read the highBid
		//
//		if (getHighBid().getBidAmount() <= buyoutAmount) {
		//
		// if we make it protected we can refer to it without the getter
		// because it is avaialble to all subclasses of Auction
		if (currentHighBid.getBidAmount() <= buyoutAmount) {
			isBuyoutWinningBid = super.placeBid(offeredBid);
		}
		
		return isBuyoutWinningBid;	
	}
	
	// this is here to demo accessing as Auction vs. BuyoutAuction (see Application class)
	public void dummyMethod() {
		
	}
	

}
