package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.model.User;

@Controller
public class MainController {

	@ExceptionHandler(ResourceNotFoundException.class)
    public String handleResourceNotFoundException() {
        return "DashBoard/page_404";
    }

	
	// Go page Login
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String createManual(ModelMap m) {
		User user = new User();
		m.addAttribute("user", user);
		return "login";
	}
	
	// Go page accessDenied
	@RequestMapping("/accessDenied")
	public String accessDenied() {
		return "DashBoard/page_403";
	}
	
	
	@RequestMapping("/group9/user")
	public String user2() {
		return "admin2";
	}
	
	
	@RequestMapping("/group9/admin")
	public String user3() {
		return "admin3";
	}
	
	//Logout Page
	@RequestMapping("/logout")
	public String logout(final Model model) {
		model.addAttribute("message", "Logged out!");
		User user = new User();
		model.addAttribute("user", user);
		return "login";
	}
		
		//Go to Dashboard
		@RequestMapping("/dashboard")
		public String admin() {
			return "DashBoard/index";
		}
	
}
