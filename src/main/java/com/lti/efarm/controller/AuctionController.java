package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.efarm.model.Auction;

import com.lti.efarm.service.AuctionService;


@Controller
@RequestMapping("/auction")
public class AuctionController 
{

	@Autowired
	private AuctionService auctionService;
	
	
	@RequestMapping(value = "/showAuction", method = RequestMethod.GET) 
	public String showAuction(@RequestParam("bidamt") int bid,Model theModel)
	{
		Auction theAuction=new Auction();
		theModel.addAttribute("bamt", bid);
		theModel.addAttribute("auction",theAuction);
		return "AuctionBidding";
	}
	
	@RequestMapping(value = "/transferSellRequest",  method = {RequestMethod.POST, RequestMethod.GET})
	public String transferSellRequest(){
	   
	   return "redirect:/sellReq/savePlaceSellRequest";
	}

	
	@PostMapping("saveAuction")
	public String saveAuction(@ModelAttribute("auction") Auction theAuction)
	{
	auctionService.saveAuction(theAuction);
		return "redirect:/auction/list";
	}

@GetMapping("/list")
	public String listAuctionreq(ModelMap theModel)
	{
	List<Auction> theAuction=auctionService.getAuction();
	theModel.addAttribute("auctions",theAuction);
	return "Auction-list";
	
	}


	
}
