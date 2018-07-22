package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.model.Invoice;
import com.dxc.model.Service;
import com.dxc.model.User;
import com.dxc.service.InvoiceService;
import com.dxc.service.ServiceG9Service;
import com.dxc.service.UserService;

@Controller
@RequestMapping("/dashboard/invoices")
public class InvoiceController {
	@Autowired
	ServiceG9Service serviceG9Service;
	
	//redict to add Voices 
	@RequestMapping("")
			public String invoces(final Model model) {
				
				model.addAttribute("servicelist", serviceG9Service.getAll());
				Invoice invoice = new Invoice();
				model.addAttribute("invoice", invoice);
				return "DashBoard/tables_dynamic";
			}
			
			//Go to Dashboard
			@RequestMapping("/formInvoices/{name}")
			public String dashboard(@PathVariable("name") String name,final Model model) {
				
				System.out.println("đa vo trong đây");
				Service service = serviceG9Service.getOneCus(name);
				System.out.println(service.getNameService());
				model.addAttribute("kt", true);
				model.addAttribute("nameServices", service.getNameService());
				return "DashBoard/tables_dynamic";
			}
			
			
	
}
