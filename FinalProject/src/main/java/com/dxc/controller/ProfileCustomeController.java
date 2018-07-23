package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.model.Invoice;
import com.dxc.model.User;
import com.dxc.security.CustomAuthToken;
import com.dxc.service.UserService;

@Controller
@RequestMapping("/dashboard/")
public class ProfileCustomeController {
       
	@Autowired
	UserService userService;
	
	@RequestMapping("/showProfile")
	public String showProfile(ModelMap modelMap,CustomAuthToken auth) {
		
		User cus = auth.getUserCus();
		modelMap.addAttribute("customer", cus);
	
		
		return "DashBoard/Profile_Customer";
	}
	
	@RequestMapping("/addProfile")
	public String addProfile(ModelMap modelMap,@ModelAttribute(value = "customer") User customer,CustomAuthToken auth) {
		
		customer.setRole(true);
		customer.setActive(true);
		userService.saveOrUpdate(customer);

		if(!auth.getUserCus().getPassCustomer().equals(customer.getPassCustomer()))
		{

			return "redirect:/j_spring_security_logout";
		}

		modelMap.addAttribute("customer", customer);
	
		
		return "DashBoard/Profile_Customer";
	}
	
}
