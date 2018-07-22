package com.dxc.service;

import java.util.ArrayList;


import com.dxc.model.Service;


public interface ServiceG9Service {

/*	public void saveOrUpdate(Invoice ivoice);*/
	public ArrayList<Service> getAll();
	public Service getOneCus(String name);
	
}
