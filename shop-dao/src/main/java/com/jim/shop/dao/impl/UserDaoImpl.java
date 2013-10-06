package com.jim.shop.dao.impl;

import org.hibernate.Session;

import com.jim.shop.dao.IUserDao;
import com.jim.shop.entity.User;
import com.jim.shop.util.HiberanteUtil;

public class UserDaoImpl implements IUserDao {

	public void add(User user) {
		Session session = HiberanteUtil.getSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

	public void deleteById(int id) {
		Session session = HiberanteUtil.getSession();
		session.beginTransaction();
		User u = (User) session.load(User.class, id);
		session.delete(u);
		session.getTransaction().commit();
	}

	public User load(int id) {
		Session session = HiberanteUtil.getSession();
		session.beginTransaction();
		User u = (User) session.load(User.class, id);
		session.getTransaction().commit();
		return u;
	}

	public User get(int id) {
		Session session = HiberanteUtil.getSession();
		session.beginTransaction();
		User u = (User) session.get(User.class, id);
		session.getTransaction().commit();
		return u;
	}
}
