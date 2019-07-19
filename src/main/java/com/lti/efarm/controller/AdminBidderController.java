package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.efarm.model.Bidder;
import com.lti.efarm.service.BidderService;

@Controller
@RequestMapping("/adminbid")
public class AdminBidderController 
{

	@Autowired
	private BidderService bidderService;
	
	
	
	@GetMapping("/listBidder")
	public String listCandidate(ModelMap theModel) {
		List<Bidder> theBidder=bidderService.getBidder();
		theModel.addAttribute("bidders",theBidder);
		return "bidder-list";
	}
	
	@GetMapping("/showAdminBidder")
	public String showFarmerAdmin(ModelMap theModel)
	{
		//Farmer theFarmer=new Farmer();
		//theModel.addAttribute("farmer",theFarmer);
		return "admin-bidder-login";
	}
	
}
