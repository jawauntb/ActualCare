package com.actualcare.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}


