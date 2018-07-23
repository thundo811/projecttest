package com.dxc.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.service.InvoiceService;
import com.dxc.service.UserService;
import com.dxc.model.User;

@Controller

public class LoginController {

	@Autowired
	UserService userServer;
	


	

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginUser(@RequestParam(value = "error", required = false) final String error,ModelMap modelMap, @ModelAttribute(value = "user") User user) {
		if (error != null) {
			modelMap.addAttribute("message", "Login Failed!");
		}
		return "login";
		/*User userCheck = userServer.getOneCus(user.getNameCustomer());
		
		if(userCheck!=null) {
		
		if(user.getPassCustomer().equals(userCheck.getPassCustomer()))	{
			
		modelMap.put("user", user);
		return "welcome";
		}
		
		}*/
		
	}


	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String registerUser(@Valid  @ModelAttribute(value = "user")  User user, BindingResult result, ModelMap modelMap ) {

		if (result.hasErrors()) {
			
			return "signupError";
		}

		
		userServer.saveOrUpdate(user);

		return "login";
	}


}
