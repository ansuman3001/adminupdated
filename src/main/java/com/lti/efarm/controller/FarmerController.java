package com.lti.efarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.efarm.model.Farmer;
import com.lti.efarm.service.FarmerService;



@Controller
@RequestMapping("/farmer")
public class FarmerController
{
	@Autowired
	private FarmerService farmerService;

	
	@GetMapping("/showFarmer")
	public String showSignInForFarmer(ModelMap theModel)
	{
		Farmer theFarmer=new Farmer();
		theModel.addAttribute("farmer",theFarmer);
		return "farmer-form";
	}
	
	@GetMapping("/showFarmerafter")
	public String afterFarmerReg(ModelMap theModel)
	{
		return "after-farmer-reg";
	}
	
	
	
	
	@GetMapping("/aboutus")
	public String contactUs(ModelMap theModel)
	{
		return "about-us";
	}
	
	@GetMapping("/showafterContact")
	public String afterContact(ModelMap theModel)
	{
		return "contact-us-submitted";
	}
	
	
	@PostMapping("saveFarmer")
		public String saveFarmer(@ModelAttribute("farmer") Farmer theFarmer)
		{
		farmerService.saveFarmer(theFarmer);
			return "redirect:/farmer/list";
		}
	
	@GetMapping("/list")
		public String listFarmers(ModelMap theModel)
		{
		List<Farmer> theFarmers=farmerService.getFarmer();
		theModel.addAttribute("farmers", theFarmers);
		return "farmer-list";
		}
	
	
	@GetMapping("/showRegFarmer")
	public String saveFarmerDetails(ModelMap theModel)
	{
		Farmer theFarmer=new Farmer();
		theModel.addAttribute("farmer",theFarmer);
		return "farmer-reg";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("farmerId") int theId,
									ModelMap theModel) {
		Farmer theFarmer = farmerService.getFarmer(theId);	
		theModel.addAttribute("farmer", theFarmer);
		return "farmer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("farmerId") int theId)
	{
		farmerService.deleteFarmer(theId);
		return "redirect:/farmer/list";
	}
	
	@GetMapping("/contactus")
	public String saveContactUs(ModelMap theModel)
	{
		
		return "contact-us";
	}
	


	
	
	
}