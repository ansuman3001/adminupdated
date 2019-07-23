package com.lti.efarm.service;

import java.util.List;

import com.lti.efarm.model.Auction;




public interface AuctionService {
	public void saveAuction(Auction theAuction);
	
	public List<Auction> getAuction();
	public Auction getAuction(int theId);

}