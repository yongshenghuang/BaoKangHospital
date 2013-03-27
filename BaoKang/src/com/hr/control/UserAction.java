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

import com.hr.dao.UserDao;
import com.hr.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	public UserDao userdao;
	public List<User> userlist;
	String tip;
	public User user;
	private Map session;

	public String register() throws Exception {
		session = ActionContext.getContext().getSession();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		user = getUser();
		user.setRegister_time(new Timestamp(new Date().getTime()));
		user.setOnline(1);
		int user_id = userdao.save(user);
		user = userdao.get(user_id);
		System.out.println(user.getId() + "-----------");
		if (user_id > 0) {
			session.put("user", user);
			return "register_success";
		} else {
			setTip("注册失败,重新注册");
			return "register_fail";

		}
	}

	public void add() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		user = getUser();
		user.setRegister_time(new Timestamp(new Date().getTime()));
		user.setOnline(0);
		int user_id = userdao.save(user);
		if (user_id > 0) {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			response.sendRedirect("User/user_head_mod.jsp?user_id=" + user_id);
		}

	}

	public String login() throws Exception {
		user = getUser();
		String email = user.getEmail();
		String pwd = user.getPassword();
		User db_user = userdao.findByEmail(email);
		if (db_user != null) {
			if (db_user.getPassword().equals(pwd)) {
				HttpServletResponse response = ServletActionContext
						.getResponse();

				db_user.setOnline(1);
				userdao.update(db_user);
				session = ServletActionContext.getContext().getSession();
				session.put("user", db_user);
				return "login_success";
			} else {
				setTip("登录失败");
				return "login_fail";
			}

		} else {
			setTip("登录失败");
			return "login_fail";

		}

	}

	public String exit() throws Exception {
		session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		user.setOnline(0);
		userdao.update(user);
		session.put("user", null);
		return "user_exit";

	}

	public String listAll() throws Exception {
		setUserlist(userdao.findAllUser());

		return "getUserList";
	}

	public String mod() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");

		user = getUser();
		int user_id = user.getId();
		String truename = user.getTruename();
		String pwd = user.getPassword();
		String tel = user.getTel();
		user = userdao.get(user_id);
		user.setTruename(truename);
		user.setPassword(pwd);
		user.setTel(tel);
		userdao.update(user);
		setUser(user);
		return "showUser";
	}

	public String update() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");

		user = getUser();
		userdao.update(user);
		setUserlist(userdao.findAllUser());
		return "getUserList";
	}

	public String load() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		int user_id = Integer.parseInt(request.getParameter("id"));
		setUser(userdao.get(user_id));

		return "loadUser";
	}

	public String show() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		int user_id = Integer.parseInt(request.getParameter("id"));
		setUser(userdao.get(user_id));

		return "showUser";
	}

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}
