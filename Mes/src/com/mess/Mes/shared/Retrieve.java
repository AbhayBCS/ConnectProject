package com.mess.Mes.shared;

import java.io.Serializable;

public class Retrieve implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String phone;
	String name;
	String des;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
}
