package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.efarm.model.Farmer;
import com.lti.efarm.model.PlaceSellReq;
import com.lti.efarm.service.PlaceSellReqService;



@Controller
@RequestMapping("/sellReq")
public class PlaceSellReqController {
	
	@Autowired
	private PlaceSellReqService placeSellReqService;
	
	@GetMapping("/showSellReqDetails")
	public String showSignInForFarmer(ModelMap theModel)
	{
		PlaceSellReq theSellReq=new PlaceSellReq();
		theModel.addAttribute("placesellreq",theSellReq);
		return "sell-request";
	}
	
	@GetMapping("/list")
	public String listFarmers(ModelMap theModel)
	{
	List<PlaceSellReq> theSellReq=placeSellReqService.getPlaceSellReq();
	theModel.addAttribute("placesellreq",theSellReq);
	return "list-sell-req";
	}
	
	
	

}
