package com.dxc.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.service.UserService;
import com.dxc.model.User;

@Controller

public class IndexController {

	@Autowired
	UserService userServer;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String createManual(ModelMap m) {

		User user = new User();
		m.addAttribute("user", user);

		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginUser(ModelMap modelMap, @ModelAttribute(value = "user") User user) {

		User userCheck = userServer.getOneCus(user.getNameCustomer());
		
		if(userCheck!=null) {
		
		if(user.getPassCustomer().equals(userCheck.getPassCustomer()))	{
			
		modelMap.put("user", user);
		return "welcome";
		}
		
		}
		return "login";
	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String registerUser(@Valid  @ModelAttribute(value = "user")  User user, BindingResult result, ModelMap modelMap ) {

		if (result.hasErrors()) {
			
			return "login";
		}

		
		userServer.saveOrUpdate(user);

		return "login";
	}

}
