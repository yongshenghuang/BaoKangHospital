package com.hr.dao;

import java.util.List;

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
public interface UserDao {
	/**
	 * 加载Person实例
	 * 
	 * @param id
	 *            需要加载的Person实例的主键值
	 * @return 返回加载的Person实例
	 */
	User get(Integer id);

	/**
	 * 保存User实例
	 * 
	 * @param User
	 *            需要保存的User实例
	 * @return 刚刚保存的User实例的标识属性值
	 */
	Integer save(User user);

	/**
	 * 保存User实例，是否有重复的名字
	 * 
	 * @param User
	 *            需要保存的User实例
	 * @return 刚刚保存的User实例的标识属性值
	 */
	Integer isDuplicateUser(User user);

	/**
	 * 修改User实例
	 * 
	 * @param User
	 *            需要修改的User实例
	 */
	void update(User user);

	/**
	 * 删除User实例
	 * 
	 * @param id
	 *            需要删除的User实例的标识属性值
	 */
	void delete(Integer id);

	/**
	 * 删除User实例
	 * 
	 * @param User
	 *            需要删除的User实例
	 */
	void delete(User user);

	/**
	 * 根据主题名查找User
	 * 
	 * @param title
	 *            查询的人名
	 * @return 指定用户名对应的全部User
	 */
	User findByEmail(String email);

	/**
	 * 查询全部User实例
	 * 
	 * @return 全部User实例
	 */
	public List findAllUser();

	/**
	 * 查询数据表中User实例的总数
	 * 
	 * @return 数据表中User实例的总数
	 */
	// 得到註冊總人數
	long getUserNumber();

	/**
	 * 檢查User实例
	 * 
	 * @param User
	 * 
	 * @return 刚刚檢查的User实例的标识属性值
	 */
	Integer checkUser(User user);

}