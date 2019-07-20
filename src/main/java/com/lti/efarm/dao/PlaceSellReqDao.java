package com.lti.efarm.dao;

import java.util.List;

import com.lti.efarm.model.PlaceSellReq;



public interface PlaceSellReqDao {
	
public void saveSellReq(PlaceSellReq theSellReq);
public List<PlaceSellReq> getPlaceSellReq();
public PlaceSellReq getPlaceSellReq(int theReqId);

}
