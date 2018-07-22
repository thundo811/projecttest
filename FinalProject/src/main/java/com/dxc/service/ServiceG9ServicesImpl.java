package com.dxc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.InvoiceDAO;
import com.dxc.dao.ServiceG9DAO;
import com.dxc.dao.UserDAO;
import com.dxc.model.Invoice;
import com.dxc.model.User;




@Service
public class ServiceG9ServicesImpl implements ServiceG9Service {

	ServiceG9DAO u;
	

	public ServiceG9DAO getU() {
		return u;
	}

	@Autowired
	public void setU(ServiceG9DAO u) {
		this.u = u;
	}

	@Override
	public ArrayList<com.dxc.model.Service> getAll() {
		// TODO Auto-generated method stub
		return getU().getAll();
	}

	@Override
	public com.dxc.model.Service getOneCus(String name) {
		// TODO Auto-generated method stub
		return 	getU().getOneCus(name);
	}

/*	@Override
	public void saveOrUpdate(Invoice invoice) {
		getU().saveOrUpdate(invoice);
		
	}
*/
	



	
}
