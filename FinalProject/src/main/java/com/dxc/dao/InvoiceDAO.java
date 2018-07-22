package com.dxc.dao;

import java.util.ArrayList;

import com.dxc.model.Invoice;


public interface InvoiceDAO {

	public void saveOrUpdate(Invoice invoice);
	public ArrayList<Invoice> getAll();
/*	public Service getOneCus(String id);*/
	
}
