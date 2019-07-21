package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String showSellRequestForm(ModelMap theModel)
	{
		PlaceSellReq theSellReq=new PlaceSellReq();
		theModel.addAttribute("placeSellReq",theSellReq);
		return "sell-request";
	}

	@GetMapping("/listSellreq")
	public String listSellreq(ModelMap theModel) {
		List<PlaceSellReq> theSellReq=placeSellReqService.getPlaceSellReq();
		theModel.addAttribute("sellrequests",theSellReq);
		return "sell-list";
	}
	
	
	@PostMapping("/savePlaceSellRequest")
	public String savePlaceSellReq(@ModelAttribute("placeSellReq") PlaceSellReq theSellReq)
	{
		
	placeSellReqService.saveSellReq(theSellReq);
		return "redirect:/placeSellReq/list";

	}
	
	
	@GetMapping("/list")
	public String listSellDetails(ModelMap theModel)
	{
	List<PlaceSellReq> theSellReq=placeSellReqService.getPlaceSellReq();
	theModel.addAttribute("placesellreq",theSellReq);
	return "list-sell-req";
	}
	
	
	

}
