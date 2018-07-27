package com.dxc.controller;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.dxc.model.Service;



import com.dxc.service.ServiceG9Service;


@Controller
@RequestMapping("/group9/admin")
public class serviceController {
	@Autowired
	ServiceG9Service serviceG9Service;


	private String saveDirectory = null; 

	//redict to add Voices 
	@RequestMapping("/show")
			public String invoces(final Model model) {
				
				
				Service service = new Service();
				model.addAttribute("service", service);
				model.addAttribute("servicelist", serviceG9Service.getAll());
				return "DashBoard/tables_services";
			}
			
		
			
			@RequestMapping(value="/service/add", method = RequestMethod.POST)
			public String dashboardAddInvoices(ModelMap modelMap, @ModelAttribute(value = "service") Service service, Model model)  {
				//Sovled Date to DB
   	
				serviceG9Service.saveOrUpdate(service);
				Service service1 = new Service();
				model.addAttribute("service", service1);
				modelMap.addAttribute("servicelist", serviceG9Service.getAll());
				return "DashBoard/tables_services";
			}
			
			@RequestMapping("/service/delete/{id}")
			public String deleteInvoice(@PathVariable("id") String id,final Model model) {
				
				serviceG9Service.delete(Long.parseLong(id));
				
				Service service = new Service();
				model.addAttribute("service", service);
				model.addAttribute("servicelist", serviceG9Service.getAll());
				return "DashBoard/tables_services";
			}
			
			@RequestMapping("/service/update/{id}")
			public String updateInvoice(@PathVariable("id") String id,final Model model)  {
				Service service = serviceG9Service.getOneSev(Long.parseLong(id));
				model.addAttribute("ktUpdateId", true);
				model.addAttribute("service", service);
				model.addAttribute("servicelist", serviceG9Service.getAll());
				return "DashBoard/tables_services";
			}
			

			
			
			
	
}
