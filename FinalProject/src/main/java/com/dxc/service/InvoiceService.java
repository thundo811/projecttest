package com.dxc.service;

import java.util.ArrayList;

import com.dxc.model.Invoice;
import com.dxc.model.Service;


public interface InvoiceService {

	public void saveOrUpdate(Invoice ivoice);
	public ArrayList<Invoice> getAll();
	public Invoice getOneInv(Long id);
	public void delete(Long id) ;
}
