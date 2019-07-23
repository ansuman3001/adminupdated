package com.lti.efarm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.efarm.dao.AuctionDao;

import com.lti.efarm.model.Auction;

@Service
public class AuctionServiceImpl implements AuctionService {
	
	@Autowired
	private AuctionDao auctionDAO;

	@Transactional
	public void saveAuction(Auction theAuction) {
          auctionDAO.saveAuction(theAuction)	;	

	}

	@Transactional
	public List<Auction> getAuction() {
		return auctionDAO.getAuction();
	}

	@Override
	public Auction getAuction(int theId) {
		return auctionDAO.getAuction(theId);
	}

}
