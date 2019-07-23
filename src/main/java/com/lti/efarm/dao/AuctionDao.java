package com.lti.efarm.dao;

import java.util.List;

import com.lti.efarm.model.Auction;


public interface AuctionDao {
	public void saveAuction(Auction theAuction);
	public List<Auction> getAuction();
	public Auction getAuction(int theId);
}

