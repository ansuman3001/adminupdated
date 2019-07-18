package com.lti.efarm.service;

import java.util.List;

import com.lti.efarm.model.Bidder;



public interface BidderService {
	
public void saveBidder(Bidder theBidder);
	
	public List<Bidder> getBidder();
	public Bidder getBidder(int theId);

}
