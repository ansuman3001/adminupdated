package com.lti.efarm.service;

import java.util.List;

import com.lti.efarm.model.PlaceSellReq;



public interface PlaceSellReqService {
	
public void saveSellReq(PlaceSellReq theSellReq);
	
	public List<PlaceSellReq> getPlaceSellReq();
	public PlaceSellReq getPlaceSellReq(int theReqId);

}
