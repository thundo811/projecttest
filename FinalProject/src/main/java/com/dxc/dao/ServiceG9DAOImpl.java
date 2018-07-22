package com.dxc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.model.Invoice;
import com.dxc.model.Service;
import com.dxc.model.User;

@Repository
@Transactional
public class ServiceG9DAOImpl implements ServiceG9DAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ArrayList<Service> getAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Service>) getSessionFactory().getCurrentSession().createQuery("from Service").list();
	}

	@Override
	public Service getOneCus(String name) {
		// TODO Auto-generated method stub
		return (Service) sessionFactory.getCurrentSession()
				.createQuery("from Service where name_service = :name").setParameter("name", name)
				.uniqueResult();
	}

/*	@Override
	public void saveOrUpdate(Invoice invoice) {
		getSessionFactory().getCurrentSession().saveOrUpdate(invoice);
		
	}*/


}
