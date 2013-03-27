package com.hr.dao.impl;

import java.util.Collection;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.hr.dao.UserDao;
import com.hr.vo.User;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

public class UserDaoImpl implements UserDao {
	// 定义一个HibernateTemplate对象，用于执行持久化操作
	private HibernateTemplate ht = null;
	// Hibernate持久化操作所需的SessionFactory
	private SessionFactory sessionFactory;

	// 依赖注入SessionFactory的setter方法
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// 初始化HibernateTemplate的方法
	private HibernateTemplate getHibernateTemplate() {
		if (ht == null) {
			ht = new HibernateTemplate(sessionFactory);
		}
		return ht;
	}

	/**
	 * 加载Person实例
	 * 
	 * @param id
	 *            需要加载的Person实例的标识属性值
	 * @return 指定id对应的Person实例
	 */
	public User get(Integer id) {
		return (User) getHibernateTemplate().get(User.class, id);
	}

	/**
	 * 保存Person实例
	 * 
	 * @param person
	 *            需要保存的Person实例
	 * @return 刚刚保存的Person实例的标识属性值
	 */
	public Integer save(User User) {
		return (Integer) getHibernateTemplate().save(User);
	}

	/**
	 * 修改User实例
	 * 
	 * @param User
	 *            需要修改的User实例
	 */
	public void update(User User) {
		getHibernateTemplate().update(User);
	}

	/**
	 * 删除User实例
	 * 
	 * @param id
	 *            需要删除的User实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * 删除User实例
	 * 
	 * @param User
	 *            需要删除的User实例
	 */
	public void delete(User User) {
		getHibernateTemplate().delete(User);
	}

	/**
	 * 根据用户名查找User
	 * 
	 * @param name
	 *            查询的人名
	 * @return 指定用户名对应的全部User
	 */
	public User findByEmail(String email) {
		return (User) getHibernateTemplate().find(
				"from User p where p.email = ?", email).get(0);
	}

	/**
	 * 查询全部User实例
	 * 
	 * @return 全部User实例
	 */
	public List findAllUser() {
		return (List<User>) getHibernateTemplate().find("from User");
	}

	/**
	 * 查询数据表中User实例的总数
	 * 
	 * @return 数据表中User实例的总数
	 */
	public long getUserNumber() {
		return (Long) getHibernateTemplate().find(
				"select count(*) from User as p").get(0);
	}

	public Integer isDuplicateUser(User user) {

		int temp = getHibernateTemplate().find("from User p where p.mail=?",
				user.getEmail()).size();
		System.out.println(temp + " 查询结果");
		if (temp > 0) {
			return 1;// 1代表已存在
		} else
			return 0;// 0代表没有
	}

	public Integer checkUser(User user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		int temp = getHibernateTemplate().find(
				"from User p where p.email=? and p.password=?",
				new Object[] { user.getEmail(), user.getPassword() }).size();
		if (1 == temp) {
			return 1;
		}

		return 0;
	}

}