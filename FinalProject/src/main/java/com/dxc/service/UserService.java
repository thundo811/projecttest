package com.dxc.service;

import java.util.ArrayList;

import com.dxc.model.User;

public interface UserService {

	public void saveOrUpdate(User u);
	public ArrayList<User> getAll();
	public User getOneCus(String name);
	
}
