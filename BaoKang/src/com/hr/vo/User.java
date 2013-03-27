package com.hr.vo;

import java.sql.Timestamp;
import java.util.Set;

public class User {
	private String email;
	private int id;
	private String password;
	private int ismember;
	private String tel;
	private Timestamp register_time;
	private int type;
	private int online;
	private String truename;
	private String image_uuid;

	public Timestamp getRegister_time() {
		return register_time;
	}

	public void setRegister_time(Timestamp registerTime) {
		register_time = registerTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsmember() {
		return ismember;
	}

	public void setIsmember(int ismember) {
		this.ismember = ismember;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getImage_uuid() {
		return image_uuid;
	}

	public void setImage_uuid(String imageUuid) {
		image_uuid = imageUuid;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
