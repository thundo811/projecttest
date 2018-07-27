package com.dxc.service;

import java.util.ArrayList;

import com.dxc.model.Invoice;
import com.dxc.model.Service;


public interface ServiceG9Service {


	public ArrayList<Service> getAll();
	public Service getOneCus(String name);
	public void delete(Long id) ;
	public void saveOrUpdate(Service service);
	public Service getOneSev(Long id);
	
}
