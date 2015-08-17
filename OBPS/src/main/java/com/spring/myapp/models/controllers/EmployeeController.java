package com.spring.myapp.models.controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Employee;
import com.spring.myapp.utils.HibernateUtil;

public class EmployeeController {

	public Employee createEmployee(Employee employee) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.save(employee);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return employee;
	}

	public Employee readEmployee(Employee employee) {

		Session session = null;
		Transaction transact = null;
		Employee employee2 = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			Query query = session.createQuery("FROM Employee where employeeId = :pk ");
			query.setParameter("pk", employee.getEmployeeId());
			employee2 = (Employee) query.list().get(0);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return employee2;
	}

	public Employee updateEmployee(Employee employee) {
		Session session = null;
		Transaction transact = null;
		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.update(employee);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return employee;
	}

	public Employee deleteEmployee(Employee employee) {
		Session session = null;
		Transaction transact = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			session.delete(employee);
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeConnection();
		}
		return employee;
	}

	public List<Employee> listEmployee() {
		Session session = null;
		Transaction transact = null;
		List<Employee> employees = null;

		try {
			session = HibernateUtil.getConnection();
			transact = session.beginTransaction();
			employees = (List<Employee>) session.createQuery("FROM Employee").list();
			transact.commit();
		} catch (Exception e) {
			transact.rollback();
			e.printStackTrace();
			return employees;
		} finally {
			HibernateUtil.closeConnection();
		}
		return employees;
	}

}
