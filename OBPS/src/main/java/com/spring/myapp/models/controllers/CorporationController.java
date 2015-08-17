package com.spring.myapp.models.controllers;

import com.spring.myapp.models.Corporation;
import com.spring.myapp.utils.HibernateUtil;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class CorporationController{

    public Corporation createCorporation(Corporation corporation) {
    	Session session = null;
        Transaction transact = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            session.save(corporation);
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return corporation;
    }

    public Corporation readCorporation(Corporation corporation) {
    	Session session = null;
        Transaction transact = null;

        Corporation corporation2 = null;

        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            Query query = session.createQuery("FROM Corporation where corporationId = :pk ");
            query.setParameter("pk", corporation.getCorporationId());
            corporation2 = (Corporation) query.list().get(0); 
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return corporation2;
    }

    public Corporation updateCorporation(Corporation corporation) {
    	Session session = null;
        Transaction transact = null;

        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            session.update(corporation);
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return corporation;
    }

    public Corporation deleteCorporation(Corporation corporation) {
    	Session session = null;
        Transaction transact = null;

        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            session.delete(corporation);
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
        	HibernateUtil.closeConnection();
        }
        return corporation;
    }

    public List<Corporation> listCorporation() {
    	Session session = null;
        Transaction transact = null;
        
        List<Corporation> corporations = null;
        try {
        	session = HibernateUtil.getConnection();
            transact = session.beginTransaction();
            corporations = (List<Corporation>) session.createQuery("FROM Corporation").list();
            transact.commit();
        }catch (Exception e) {
            transact.rollback();
            e.printStackTrace();
        }finally{
            HibernateUtil.closeConnection();
        }
        return corporations;
    }

}
