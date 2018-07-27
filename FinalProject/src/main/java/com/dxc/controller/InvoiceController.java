package com.dxc.controller;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

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

import com.dxc.model.Invoice;
import com.dxc.model.Service;
import com.dxc.model.User;
import com.dxc.security.CustomAuthToken;
import com.dxc.service.InvoiceService;
import com.dxc.service.ServiceG9Service;
import com.dxc.service.UserService;

@Controller
@RequestMapping("/dashboard/invoices")
public class InvoiceController {
	@Autowired
	ServiceG9Service serviceG9Service;
	@Autowired
	InvoiceService   invoiceService;

	private String saveDirectory = null; 

	//redict to add Voices 
	@RequestMapping("")
			public String invoces(final Model model) {
				
				model.addAttribute("servicelist", serviceG9Service.getAll());
				model.addAttribute("invoicelist", invoiceService.getAll());
				Invoice invoice = new Invoice();
				model.addAttribute("invoice", invoice);
				return "DashBoard/tables_dynamic";
			}
			
			//Go to Dashboard
			@RequestMapping("/formInvoices/{name}")
			public String dashboard(@PathVariable("name") String name,final Model model) {
				Invoice invoice = new Invoice();
				model.addAttribute("invoice", invoice);
				model.addAttribute("kt", true);
				model.addAttribute("servicelist", serviceG9Service.getAll());
				model.addAttribute("oneService", serviceG9Service.getOneCus(name));
				model.addAttribute("invoicelist", invoiceService.getAll());
				return "DashBoard/tables_dynamic";
			}
			
			@RequestMapping(value="/formInvoices/add", method = RequestMethod.POST)
			public String dashboardAddInvoices(ModelMap modelMap, @ModelAttribute(value = "invoice") Invoice invoice, Model model,CustomAuthToken auth,HttpServletRequest request) throws ParseException {
				//Sovled Date to DB
				
				  String fileName2 = null;
				  String fileName = null;
					fileName2 = "E:\\github\\projecttest\\FinalProject\\src\\main\\webapp\\resources\\images";



				    System.out.println(fileName2);
					try {
						
						MultipartFile multipartFile = invoice.getMultipartFile();
						System.out.println(multipartFile.getOriginalFilename()+"    ");
						if( multipartFile.getOriginalFilename().equals("")) {
						
							fileName = "defaul";
						}else {
							fileName = multipartFile.getOriginalFilename();
						File file = new File(fileName2, invoice.getContractNumber()+".jpg");
						
						multipartFile.transferTo(file);
						}
					
					} catch (Exception e) {
						e.printStackTrace();
						model.addAttribute("message", "upload failed");
					}
				
				
				System.out.println(invoice.getDate()+"may vao day chua");
				String newstring = new SimpleDateFormat("yyyy/MM/dd").format(invoice.getDate());
				Date date = new SimpleDateFormat("yyyy/MM/dd").parse(newstring);
				invoice.setDate(date);
				invoice.setImageInvoice(invoice.getContractNumber()+".jpg");
				/*System.out.println(newstring +"ngay ms");
					System.out.println(invoice.getNameCompany()+"23"+invoice.getContractNumber());
	System.out.println(auth.getUserCus().getId());
	 	System.out.println(invoice.getServices_inv().getIdservice());
	 	   User userChecking = (User) userService.getOneCus(invoice.customer_inv.getNameCustomer());
	*/
				Double a = Double.valueOf(invoice.getGrandTotal()+"")*invoice.getIndexConsumed();
				invoice.setGrandTotal(BigDecimal.valueOf(a));
				   	invoice.setCustomer_inv(auth.getUserCus());	   	
					invoiceService.saveOrUpdate(invoice);
				modelMap.addAttribute("kt", false);
				modelMap.addAttribute("servicelist", serviceG9Service.getAll());
				modelMap.addAttribute("invoicelist", invoiceService.getAll());
				return "DashBoard/tables_dynamic";
			}
			
			@RequestMapping("/formInvoices/delete/{id}")
			public String deleteInvoice(@PathVariable("id") String id,final Model model) {
				
				invoiceService.delete(Long.parseLong(id));
				
				Invoice invoice = new Invoice();
				model.addAttribute("invoice", invoice);
				model.addAttribute("kt", false);
				model.addAttribute("servicelist", serviceG9Service.getAll());
				model.addAttribute("invoicelist", invoiceService.getAll());
				return "DashBoard/tables_dynamic";
			}
			
			@RequestMapping("/formInvoices/update/{id}")
			public String updateInvoice(@PathVariable("id") String id,final Model model) throws ParseException {
				Invoice invoice = invoiceService.getOneInv(Long.parseLong(id));
				model.addAttribute("invoice", invoice);
				model.addAttribute("ktUpdateId", true);
				model.addAttribute("kt", true);
				model.addAttribute("servicelist", serviceG9Service.getAll());
				model.addAttribute("oneService", invoice.getServices_inv());
				model.addAttribute("invoicelist", invoiceService.getAll());
				return "DashBoard/tables_dynamic";
			}
			

			@RequestMapping("/report")
			public String reportInvoice(final Model model,CustomAuthToken auth) throws ParseException  {
	
/*				String newstartDate = new SimpleDateFormat("yyyy/MM/dd").format(startDate);
				String newendDate = new SimpleDateFormat("yyyy/MM/dd").format(startDate);
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String frmDate = format.parse(newstartDate);
				String enDate = format.parse(newendDate);
				, @RequestParam("frmDate") String frmDate, @RequestParam("endDate") String endDate
				*/
				model.addAttribute("invoiceCustomer", auth.getUserCus());
				model.addAttribute("invoicelist", invoiceService.getAllReport("2016-06-20", "2020-08-25"));
				return "DashBoard/_invoice";

			}
			
			
			@RequestMapping(value="/reportbetweenDays", method = RequestMethod.POST)
			public String reportInvoiceBetweenDays(final Model model,CustomAuthToken auth, @RequestParam("frmDate") String frmDate, @RequestParam("endDate") String endDate) throws ParseException  {
	
/*				String newstartDate = new SimpleDateFormat("yyyy/MM/dd").format(startDate);
				String newendDate = new SimpleDateFormat("yyyy/MM/dd").format(startDate);
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String frmDate = format.parse(newstartDate);
				String enDate = format.parse(newendDate);
				
				*/
				
				System.out.println(frmDate +"test thu");
				model.addAttribute("invoiceCustomer", auth.getUserCus());
				model.addAttribute("invoicelist", invoiceService.getAllReport(frmDate, endDate));
				return "DashBoard/_invoice";

			}
			
			
	
}
