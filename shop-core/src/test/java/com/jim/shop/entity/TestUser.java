package com.jim.shop.entity;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jim.shop.util.HiberanteUtil;

public class TestUser {

	private int id;
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		if (sessionFactory != null) {
			return sessionFactory;
		}
		return new Configuration().configure().buildSessionFactory();
	}

	@Test
	public void testAdd() {
		Session session = HiberanteUtil.getSession();
		session.beginTransaction();

		User u = new User("jimTest", "123456", new Date());
		u.setNickName("jimTest");
		session.save(u);

		id = u.getId();
		assertNotNull("存储用户失败", id);
		
		session.delete(u);

		session.getTransaction().commit();
	}
	
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}
}
