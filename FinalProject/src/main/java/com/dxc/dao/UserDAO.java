package com.dxc.dao;

import java.util.ArrayList;

import com.dxc.model.User;

public interface UserDAO {

	public void saveOrUpdate(User u);
	public ArrayList<User> getAll();
	public User getOneCus(String name);
	
}
