package com.jim.shop.entity;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> l = new ArrayList<User>();
		l.add(new User("jim1", "123456", new Date()));
		l.add(new User("jim2", "123456", new Date()));
		l.add(new User("jim1", "111111", new Date()));
		l.add(new User("jim1", "111111", new Date()));
		l.add(new User("jim3", "222222", new Date()));
		l.add(new User("jim5", "333333", new Date()));
		l.add(new User("jim5", "333333", new Date()));
		List<User> ll = new ArrayList<User>();
		ll.add(new User("jim3", "222222", new Date()));
		ll.add(new User("jim5", "333333", new Date()));
		ll.add(new User("jim5", "333333", new Date()));

		l.addAll(ll);
		
		System.out.println(l.size());
		
		Set<User> set = new HashSet<User>(l);
		l = new ArrayList<User>(set);
		
		System.out.println(l.size());
	}

	public static void print(List<User> list) {
		for (User user : list) {
			MessageFormat.format("loginName:{0}  password:{1}", user.getLoginName(),user.getPassword());
		}
	}
}
