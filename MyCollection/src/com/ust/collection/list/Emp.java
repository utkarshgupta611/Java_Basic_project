package com.ust.collection.list;

import java.util.List;

public class Emp {
	private int id;
	private String name;
	private long mobile;
	public Emp(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public Emp(List<Emp> empList, EmpComparator empComparator) {
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "\n[Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}


}
