package com.ust.obj;

public class Emp implements Cloneable{
private int id;
private String name;
private long mobile;

public Emp(int id, String name, long mobile) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
}

public Emp(Emp emp) {
	// copy constructor called out
	this.id = emp.getId();
	this.name = emp.getName();
	this.mobile = emp.getMobile();
}

@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
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


	

}
