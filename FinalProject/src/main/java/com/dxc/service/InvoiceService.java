package com.dxc.service;

import java.text.ParseException;
import java.util.ArrayList;

import com.dxc.model.Invoice;
import com.dxc.model.Service;


public interface InvoiceService {

	public void saveOrUpdate(Invoice ivoice);
	public ArrayList<Invoice> getAll();
	public Invoice getOneInv(Long id);
	public void delete(Long id) ;
<<<<<<< HEAD
	public ArrayList<Invoice> getAllReport(String frmDate,String enDate) throws ParseException;
=======
	public ArrayList<Invoice> getAllReport(String frmDate,String enDate);
>>>>>>> 24c837b8f4c026401ccbeac75bf486278ba0d819
}
