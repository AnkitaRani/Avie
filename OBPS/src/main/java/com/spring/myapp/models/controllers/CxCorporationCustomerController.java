package com.spring.myapp.models.controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.CxCorporationCustomer;
import com.spring.myapp.utils.HibernateUtil;

public class CxCorporationCustomerController {

	public CxCorporationCustomer createCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.save(cxCorporationCustomer);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return cxCorporationCustomer;
	}

	public CxCorporationCustomer readCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer) {
		Session session = null;
		Transaction transact = null;
		CxCorporationCustomer cxCorporationCustomer2 = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			Query query = session.createQuery("FROM CxCorporationCustomer where cxCorporationCustomerId = :pk ");
			query.setParameter("pk", cxCorporationCustomer.getCxCorporationCustomerId());
			cxCorporationCustomer2 = (CxCorporationCustomer) query.list().get(0);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return cxCorporationCustomer2;
	}

	public CxCorporationCustomer updateCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.update(cxCorporationCustomer);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return cxCorporationCustomer;
	}

	public CxCorporationCustomer deleteCxCorporationCustomer(CxCorporationCustomer cxCorporationCustomer) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.delete(cxCorporationCustomer);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return cxCorporationCustomer;
	}

	public List<CxCorporationCustomer> listCxCorporationCustomer() {
		Session session = null;
		Transaction transact = null;
		List<CxCorporationCustomer> cxCorporationCustomers = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			cxCorporationCustomers = (List<CxCorporationCustomer>) session.createQuery("FROM CxCorporationCustomer").list();
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return cxCorporationCustomers;
		} finally {
			HibernateUtil.closeConnection();
		}
		return cxCorporationCustomers;
	}

}
