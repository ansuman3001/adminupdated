package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.efarm.model.Auction;

import com.lti.efarm.service.AuctionService;


@Controller
@RequestMapping("/auction")
public class AuctionController 
{

	@Autowired
	private AuctionService auctionService;
	
	@GetMapping("/showAuction")
	public String showAuction(ModelMap theModel)
	{
		Auction theAuction=new Auction();
		theModel.addAttribute("auction",theAuction);
		return "AuctionBidding";
	}
	
	@PostMapping("saveAuction")
	public String saveAuction(@ModelAttribute("auction") Auction theAuction)
	{
	auctionService.saveAuction(theAuction);
		return "redirect:/auction/list";
	}

@GetMapping("/list")
	public String listAuction(ModelMap theModel)
	{
	List<Auction> theAuction=auctionService.getAuction();
	theModel.addAttribute("auctions", theAuction);
	return "auction-list";
	}

	
}
