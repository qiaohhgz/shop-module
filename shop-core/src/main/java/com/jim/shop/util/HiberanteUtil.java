package com.jim.shop.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberanteUtil {

	private static final SessionFactory sessionFactory = null;

	private static SessionFactory getSessionFactory() {
		if (sessionFactory != null) {
			return sessionFactory;
		}
		return new Configuration().configure().buildSessionFactory();
	}

	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}
