package com.hr.control;
import java.io.PrintWriter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.hr.dao.CommerUserDao;
import com.hr.dao.impl.CommerUserDaoImpl;
import com.hr.vo.CommerUser;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xpath.internal.operations.And;
public class CommerUserAction {
	public CommerUserDao commerUserDao;
	//public CommerUserDaoImpl commerUserDaoImpl;
	public CommerUser commerUser;
	private Map session;
	public List<CommerUser> userlist;
	private String userType;
	
	
	/**
	 * 根据用户名和密码判断登录
	 * 
	 * @param 
	 *            
	 * @return sucsses/fail
	 */
	/*public String login()throws Exception{
		commerUser=getCommerUser();
		String name=commerUser.getName();
		String pwd=commerUser.getPassword();
		CommerUser db_user=commerUserDao.findByUserName(name);
		if(db_user!=null){
			if(db_user.getPassword().equals(pwd)){
				HttpServletResponse response=ServletActionContext.getResponse();
			  
				//db_user.setOnline(1);
				//userdao.update(db_user);
				commerUserDao.update(db_user);
				session=ServletActionContext.getContext().getSession();
				session.put("user",db_user);
				return "SUCCESS";}
			else {
				//setTip("登录失败");
				return "FALSE";
			   }
			
			
		}
		else{
			//setTip("登录失败");
			return "FALSE";
			
		}
		
				
	}*/
	public String login()throws Exception{
		commerUser=getCommerUser();
	    if(commerUser.getName().equals("yongsheng")&&commerUser.getPassword().equals("111"))
		    return userType;
		    
		return "loginFalse";
			
	
	}
	/*
	public CommerUserDaoImpl getCommerUserDaoImpl() {
		return commerUserDaoImpl;
	}

	public void setCommerUserDaoImpl(CommerUserDaoImpl commerUserDaoImpl) {
		this.commerUserDaoImpl = commerUserDaoImpl;
	}
   */
	public CommerUserDao getCommerUserDao() {
		return commerUserDao;
	}

	public void setCommerUserDao(CommerUserDao commerUserDao) {
		this.commerUserDao = commerUserDao;
	}

	public CommerUser getCommerUser() {
		return commerUser;
	}

	public List<CommerUser> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<CommerUser> userlist) {
		this.userlist = userlist;
	}
	public void setCommerUser(CommerUser commerUser) {
		this.commerUser = commerUser;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
