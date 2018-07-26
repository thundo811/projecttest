package com.dxc.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

	@Override
	public void delete(Long id) {
			sessionFactory.getCurrentSession()
							.createQuery("delete from Invoice where idinvoice = :id").setParameter("id", id)
							.executeUpdate();
		
	}

	@Override
	public Invoice getOneInv(Long id) {
		return (Invoice) sessionFactory.getCurrentSession().get(Invoice.class, id);
	}

	@Override
	public ArrayList<Invoice> getAllReport(String frmDate,String enDate) throws ParseException {
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2018-07-20");
		
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-25");
		
		// TODO Auto-generated method stub
		return (ArrayList<Invoice>) getSessionFactory().getCurrentSession()
				.createQuery("FROM Invoice AS c WHERE c.date BETWEEN :stDate AND :edDate ")
				.setParameter("stDate", date1)
				.setParameter("edDate", date2)
				.list();
	} 


}
