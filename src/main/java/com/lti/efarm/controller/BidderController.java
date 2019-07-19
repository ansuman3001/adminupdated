package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.efarm.model.Bidder;

import com.lti.efarm.service.BidderService;


@Controller
@RequestMapping("/bidder")
public class BidderController {
	
	@Autowired
	private BidderService bidderService;
	
	@GetMapping("/showBidder")
	public String showSignInForBidder(ModelMap theModel)
	{
		Bidder theBidder=new Bidder();
		theModel.addAttribute("bidder",theBidder);
		return "bidder-form";
	}
	
	@PostMapping("saveBidder")
	public String saveBidder(@ModelAttribute("bidder") Bidder theBidder)
	{
	bidderService.saveBidder(theBidder);
		return "redirect:/bidder/list";
	}
	
	@GetMapping("/list")
	public String listBidders(ModelMap theModel)
	{
	List<Bidder> theBidders=bidderService.getBidder();
	theModel.addAttribute("Bidders", theBidders);
	return "list-bidders";
	}

@GetMapping("showRegBidder")
public String saveBidderDetails(ModelMap theModel)
{
	Bidder theBidder=new Bidder();
	theModel.addAttribute("bidder",theBidder);
	return "Bidder-reg";
}
	
	
}
