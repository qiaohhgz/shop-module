package com.jim.shop.dao;

import com.jim.shop.entity.User;

public interface IUserDao {
	public void add(User user);

	public void deleteById(int id);
	
	public User load(int id);
	
	public User get(int id);
	
}
