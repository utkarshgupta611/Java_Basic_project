package com.ust.obj;

import java.io.Serializable;

public class Emp implements Serializable {

	private static final long serialVersionUID = 5311092934138413849L;
	private int id;
	private String name;
	private Object mobile;

	public Emp(int id, String name, Object mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getMobile() {
		return mobile;
	}

	public void setMobile(Object mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

}
