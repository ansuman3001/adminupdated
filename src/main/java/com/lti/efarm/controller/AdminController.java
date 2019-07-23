package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.efarm.model.Farmer;
import com.lti.efarm.service.FarmerService;



@Controller
@RequestMapping("/admin")
public class AdminController 
{
	@Autowired
	private FarmerService farmerService;
	
	@GetMapping("/showAdmin")
	public String showAdminPage(ModelMap theModel)
	{
		
		return "admin-login";
	}
	
	@GetMapping("/listFarmer")
	public String listCandidate(ModelMap theModel) {
		List<Farmer> theFarmer=farmerService.getFarmer();
		theModel.addAttribute("farmers",theFarmer);
		return "farmer-list";
	}
	
	@GetMapping("/showAdminFarmer")
	public String showFarmerAdmin(ModelMap theModel)
	{
		//Farmer theFarmer=new Farmer();
		//theModel.addAttribute("farmer",theFarmer);
		return "admin-farmer-login";
	}
	
	@GetMapping("/showAuction")
	public String showAuction(ModelMap theModel)
	{
		
		return "adminAuctionLogin";
	}
	
	
}
