package com.lti.efarm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.efarm.dao.BidderDao;

import com.lti.efarm.model.Bidder;

@Service
public class BidderServiceImpl implements BidderService {
	
	@Autowired
	private BidderDao bidderDAO;

	@Transactional
	public void saveBidder(Bidder theBidder) {
		bidderDAO.saveBidder(theBidder);

	}

	@Transactional
	public List<Bidder> getBidder() {
		return bidderDAO.getBidder();
	}

	@Transactional
	public Bidder getBidder(int theId) {
		return bidderDAO.getBidder(theId);
	}

}
