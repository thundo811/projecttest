package com.dxc.service;

import java.text.ParseException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.InvoiceDAO;
import com.dxc.dao.UserDAO;
import com.dxc.model.Invoice;
import com.dxc.model.User;




@Service
public class InvoiceServicesImpl implements InvoiceService {

	InvoiceDAO u;
	

	public InvoiceDAO getU() {
		return u;
	}

	@Autowired
	public void setU(InvoiceDAO u) {
		this.u = u;
	}

	@Override
	public ArrayList<Invoice> getAll() {
		// TODO Auto-generated method stub
		return getU().getAll();
	}

	@Override
	public void saveOrUpdate(Invoice invoice) {
		getU().saveOrUpdate(invoice);
		
	}

	@Override
	public void delete(Long id) {
		getU().delete(id);
		
	}

	@Override
	public Invoice getOneInv(Long id) {
		return getU().getOneInv(id);
	}

	@Override
<<<<<<< HEAD
	public ArrayList<Invoice> getAllReport(String frmDate, String enDate) throws ParseException {
=======
	public ArrayList<Invoice> getAllReport(String frmDate, String enDate) {
>>>>>>> 24c837b8f4c026401ccbeac75bf486278ba0d819
		// TODO Auto-generated method stub
		return getU().getAllReport(frmDate, enDate);
	}

	



	
}
