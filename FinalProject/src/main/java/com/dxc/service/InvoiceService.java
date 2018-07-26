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

	public ArrayList<Invoice> getAllReport(String frmDate,String enDate) throws ParseException;

}
