package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.model.User;
import com.dxc.security.CustomAuthToken;
import com.dxc.service.InvoiceService;

@Controller
public class MainController {
	
	@Autowired
	InvoiceService invoiceService;

	@ExceptionHandler(ResourceNotFoundException.class)
    public String handleResourceNotFoundException() {
        return "DashBoard/page_404";
    }

	
	
	// Go page Login
	@RequestMapping({"/", "/login"})
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
	
	@RequestMapping("/dashboard/abc")
	public String abc() {
		return "DashBoard/form_validation";
	}
	
	@RequestMapping("/group9/user")
	public String user2() {
		return "admin2";
	}
	
	
	@RequestMapping("/group9/admin")
	public String user3() {
		return "index";
	}
	
	//Logout Page
	@RequestMapping("/logout")
	public String logout(final Model model) {
		model.addAttribute("message", "Logged out!");
		User user = new User();
		model.addAttribute("user", user);
		return "login";
	}
		

		
		
		
		//include _Menu
				@RequestMapping("/dashboard/menu")
				public String _Menu() {
					return "DashBoard/_Menu";
				}
		
	
}
