package com.lti.efarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.efarm.model.User1;
import com.lti.efarm.service.User1Service;

@Controller
@RequestMapping("/user1")
public class Login1Controller 
{
	@Autowired
	private User1Service user1Service;
	
	@GetMapping("/login1Form")
	public String showSignInForBidder(ModelMap theModel)
	{
		User1 theUser1 = new User1();
		theModel.addAttribute("user1", theUser1);
		return "bidder-form";
	}
	
	@RequestMapping(value = "/login1User",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute User1 theUser1) {
		
		User1 usr1 = user1Service.checkUser1(theUser1);
		ModelAndView model = null;
		if (usr1 == null) {
			
			model = new ModelAndView("bidder-form");
			model.addObject("error", "Invalid Username or Password");
			System.out.println("fail");
		} else {
			
			model = new ModelAndView("welcome1");
			model.addObject("usr1", usr1);
			//model.addObject("usr1", usr1.getEmail());
		}
		return model;

}
	
}
