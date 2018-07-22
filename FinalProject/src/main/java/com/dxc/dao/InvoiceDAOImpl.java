package com.dxc.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.model.Invoice;


@Repository
@Transactional
public class InvoiceDAOImpl implements InvoiceDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ArrayList<Invoice> getAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Invoice>) getSessionFactory().getCurrentSession().createQuery("from Invoice").list();
	}

	@Override
	public void saveOrUpdate(Invoice invoice) {
		getSessionFactory().getCurrentSession().saveOrUpdate(invoice);
		
	}


}
