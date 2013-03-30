package com.hr.dao.impl;

import java.util.List;

import com.hr.dao.CommerUserDao;
import com.hr.vo.CommerUser;
import java.util.Collection;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateCallback;

public class CommerUserDaoImpl implements CommerUserDao {
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
	public Integer checkCommerUser(CommerUser User) {
		System.out.println(User.getName());
		System.out.println(User.getPassword());
			int temp=getHibernateTemplate().find("from COMMER_USER p where p.name=? and p.password=?",
					new Object[]{User.getName(),User.getPassword()}).size();
			if(temp==1){
				 return 1;
		    }
			else {
				 return 0;
			}
			
	}

	public Integer delete(String userId) {
		getHibernateTemplate().delete(get(userId));
		return 1;
	}

	public Integer delete(CommerUser User) {
		getHibernateTemplate().delete(User);
		return 1;
	}

	public List findAllCommerUser() {
		return (List<CommerUser>) getHibernateTemplate().find("from COMMER_USER");
	}

	public CommerUser findByUserName(String name) {
		return (CommerUser) getHibernateTemplate().find(
				"from COMMER_USER p where p.name = ?", name).get(0);
	}

	public CommerUser get(String userId) {
		return (CommerUser) getHibernateTemplate().get(CommerUser.class, userId);
		
	}

	public long getCommerUserNumber() {
		return (Long) getHibernateTemplate().find(
		"select count(*) from COMMER_USER as p").get(0);
	}

	public Integer isDuplicateCommerUser(CommerUser User) {
		int temp=getHibernateTemplate().find("from COMMER_USER p where p.name=?",User.getName()).size();
		System.out.println(temp+" 查询结果");
		if(temp>0){
			return 1;//1代表已存在
		}
		else 
			return 0;//0代表没有
	}

	public Integer save(CommerUser User) {
		return (Integer) getHibernateTemplate().save(User);
	}

	public Integer update(CommerUser User) {
		getHibernateTemplate().update(User);
		return 1;
	}

}
