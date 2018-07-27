package com.dxc.dao;

import java.util.ArrayList;

import com.dxc.model.Invoice;
import com.dxc.model.Service;

public interface ServiceG9DAO {

/*	public void saveOrUpdate(Invoice invoice);*/
	public ArrayList<Service> getAll();
	public Service getOneCus(String id);
	public void delete(Long id) ;
	public void saveOrUpdate(Service service);
	public Service getOneSer(Long id);
}
