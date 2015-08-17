package com.spring.myapp.models.controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.myapp.models.Department;
import com.spring.myapp.utils.HibernateUtil;

public class DepartmentController{

    public Department createDepartment(Department department) {
    	Session session = null;
        Transaction transact = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            session.save(department);
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return department;
    }

    public Department readDepartment(Department department) {
    	Session session = null;
        Transaction transact = null;
        Department department2 = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            Query query = session.createQuery("FROM Department where departmentId = :pk ");
            query.setParameter("pk", department.getDepartmentId());
            department2 = (Department) query.list().get(0); 
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return department2;
    }

    public Department updateDepartment(Department department) {
    	Session session = null;
        Transaction transact = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            session.update(department);
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return department;
    }

    public Department deleteDepartment(Department department) {
    	Session session = null;
        Transaction transact = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            session.delete(department);
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return department;
    }

    public List<Department> listDepartment() {
        
        
        Session session = null;
        Transaction transact = null;
        List<Department> departments = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();    departments = (List<Department>) session.createQuery("FROM Department").list();
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return departments;
    }

}
