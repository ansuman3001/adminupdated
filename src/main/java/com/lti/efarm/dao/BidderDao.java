package com.lti.efarm.dao;

import java.util.List;

import com.lti.efarm.model.Bidder;



public interface BidderDao {
	public void saveBidder(Bidder theBidder);
	public List<Bidder> getBidder();
	public Bidder getBidder(int theId);
	public void deleteBidder(int theId);
}
