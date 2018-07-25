package com.dxc.dao;

import java.util.ArrayList;

import com.dxc.model.Invoice;


public interface InvoiceDAO {

	public void saveOrUpdate(Invoice invoice);
	public ArrayList<Invoice> getAll();
	public Invoice getOneInv(Long id);
	public ArrayList<Invoice> getAllReport(String frmDate,String enDate);
	public void delete(Long id) ;
	
}
