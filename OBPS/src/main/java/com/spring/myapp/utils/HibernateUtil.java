package com.spring.myapp.utils;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session session;

	public static Session getConnection() {
		if (session == null || !session.isOpen()) {

			try {
				session = (Session) new Configuration().configure("hibernate/myapp-cfg.xml").buildSessionFactory().openSession();
			} catch (Throwable ex) {
				System.err.println("Initial SessionFactory creation failed." + ex);
				ex.printStackTrace();
				throw new ExceptionInInitializerError(ex);
			}
		}
		return session;
	}

	public static void closeConnection() {
		if (session != null && session.isOpen()) {
			session.close();
		}

	}

}
