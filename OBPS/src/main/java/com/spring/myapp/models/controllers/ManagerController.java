package com.spring.myapp.models.controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Manager;
import com.spring.myapp.utils.HibernateUtil;

public class ManagerController {

	public Manager createManager(Manager manager) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.save(manager);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return manager;
	}

	public Manager readManager(Manager manager) {

		Session session = null;
		Transaction transact = null;
		Manager manager2 = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			Query query = session.createQuery("FROM Manager where managerId = :pk ");
			query.setParameter("pk", manager.getManagerId());
			manager2 = (Manager) query.list().get(0);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return manager2;
	}

	public Manager updateManager(Manager manager) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.update(manager);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return manager;
	}

	public Manager deleteManager(Manager manager) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.delete(manager);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return manager;
	}

	public List<Manager> listManager() {

		Session session = null;
		Transaction transact = null;
		List<Manager> managers = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			managers = (List<Manager>) session.createQuery("FROM Manager").list();
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return managers;
		} finally {
			HibernateUtil.closeConnection();
		}
		return managers;
	}

}
