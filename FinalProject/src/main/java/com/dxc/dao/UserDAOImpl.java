package com.dxc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void saveOrUpdate(User u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);
	}

	public ArrayList<User> getAll() {
		return (ArrayList<User>) getSessionFactory().getCurrentSession().createQuery("from users").list();
	}
	

	
	@Override
	public User getOneCus(String name) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession()
				.createQuery("from User where nameCustomer = :name").setParameter("name", name)
				.uniqueResult();
	}



}
