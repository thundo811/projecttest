package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.model.User;
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
		public String dashboard() {
			return "DashBoard/index";
		}
		
		
		
		//include _Menu
				@RequestMapping("/dashboard/menu")
				public String _Menu() {
					return "DashBoard/_Menu";
				}
		
	
}
