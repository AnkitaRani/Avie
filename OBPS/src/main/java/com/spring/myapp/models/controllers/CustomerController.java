package com.spring.myapp.models.controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Customer;
import com.spring.myapp.utils.HibernateUtil;

public class CustomerController {

	public Customer createCustomer(Customer customer) {
		Session session = null;
		Transaction transact = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.save(customer);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeConnection();
		}
		return customer;
	}

	public Customer readCustomer(Customer customer) {

		Session session = null;
		Transaction transact = null;
		Customer customer2 = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			Query query = session.createQuery("FROM Customer where customerId = :pk ");
			query.setParameter("pk", customer.getCustomerId());
			customer2 = (Customer) query.list().get(0);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeConnection();
		}
		return customer2;
	}

	public Customer updateCustomer(Customer customer) {
		Session session = null;
		Transaction transact = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.update(customer);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeConnection();
		}
		return customer;
	}

	public Customer deleteCustomer(Customer customer) {
		Session session = null;
		Transaction transact = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.delete(customer);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeConnection();
		}
		return customer;
	}

	public List<Customer> listCustomer() {

		Session session = null;
		Transaction transact = null;
		List<Customer> customers = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			customers = (List<Customer>) session.createQuery("FROM Customer").list();
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeConnection();
		}
		return customers;
	}

}
