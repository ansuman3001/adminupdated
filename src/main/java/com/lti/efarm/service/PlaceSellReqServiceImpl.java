package com.lti.efarm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.efarm.dao.FarmerDao;
import com.lti.efarm.dao.PlaceSellReqDao;
import com.lti.efarm.model.PlaceSellReq;

@Service
public class PlaceSellReqServiceImpl implements PlaceSellReqService {
	
	@Autowired
	private PlaceSellReqDao placeSellReqDAO;


	@Transactional
	public void saveSellReq(PlaceSellReq theSellReq) {
		placeSellReqDAO.saveSellReq(theSellReq);

	}

	@Transactional
	public List<PlaceSellReq> getPlaceSellReq() {
		return placeSellReqDAO.getPlaceSellReq();
	}

	@Transactional
	public PlaceSellReq getPlaceSellReq(int theReqId) {
		return placeSellReqDAO.getPlaceSellReq(theReqId);
	}

}
