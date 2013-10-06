package com.jim.shop.dao.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jim.shop.dao.IUserDao;
import com.jim.shop.dao.impl.UserDaoImpl;
import com.jim.shop.entity.User;

public class TestUserDaoImpl {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private IUserDao getUserDao() {
		return new UserDaoImpl();
	}

	@Test
	public void testAdd() {
		User u = new User("jimTest4", "123456", new Date());
		u.setNickName("2");
		getUserDao().add(u);
		getUserDao().deleteById(u.getId());
	}
}
