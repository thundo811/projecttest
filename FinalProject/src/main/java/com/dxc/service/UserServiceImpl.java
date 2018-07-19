package com.dxc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.UserDAO;
import com.dxc.model.User;




@Service
public class UserServiceImpl implements UserService {

	UserDAO u;
	

	public UserDAO getU() {
		return u;
	}

	@Autowired
	public void setU(UserDAO u) {
		this.u = u;
	}

	@Override
	public void saveOrUpdate(User u) {
		getU().saveOrUpdate(u);
		
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getOneCus(String name) {
	
		return 	getU().getOneCus(name);
	}



	
}
